package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class BookName1302 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int totalNum = Integer.parseInt(br.readLine());

        //전체 팔린 책 이름을 담을 리스트와
        ArrayList<String> soldBooks = new ArrayList<>();
        //팔린 책 이름의 종류들만 볼 수 있는 Set 생성
        Set<String> soldBookNames = new HashSet<>();
        //책 이름과 팔린 개수 담을 맵 생성
        HashMap<String,Integer> bookNameAndSoldAmount = new HashMap<>();

        //책 이름 전부 받아서 리스트에 담기
        for(int i = 0; i<totalNum; i++){
            String bookName = br.readLine();
            soldBooks.add(bookName);
        }


        //리스트에 담은 것을 Set에 담아서 팔린 책의 종류들만 넣기
        soldBookNames.addAll(soldBooks);

        //리스트의 값들을 하나씩 돌면서 Set에 있는 책 이름과 같으면
        //Count를 하나씩 올린다.
        for(String soldBookName:soldBookNames){
            int count = 0;

            for(String bookName : soldBooks){
                if(soldBookName.equals(bookName)){
                    count++;
                    //이미 카운트 한건 다음 루프때 돌리지 않기 위해 삭제
                }
            }

            bookNameAndSoldAmount.put(soldBookName, count);
            soldBooks.removeAll(Collections.singleton(soldBookName));

        }

        //가장 많이 팔린 개수 -> 책 이름 찾기
        Collection<Integer> soldNum = bookNameAndSoldAmount.values();
        int mostSoldNum = 0;
        for (Integer integer : soldNum) {
            //처음 루프를 돌리는 경우
            if (mostSoldNum==0) {
                mostSoldNum = integer;
            }
            //새로운 가장 큰값이 나온경우
            if (mostSoldNum < integer) {
                mostSoldNum = integer;
            }
        }

        //엔트리 셋을 가져오고 밸류가 mostSoldNum인 키값을 다 가져온다.
        Set<Map.Entry<String, Integer>> entries = bookNameAndSoldAmount.entrySet();
        List<String> keys = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : entries){
            if(entry.getValue() == mostSoldNum){
                keys.add(entry.getKey());
            }
        }
        Collections.sort(keys);

        bw.write(keys.get(0));
        bw.flush();
        bw.close();
        br.close();



    }
}
































