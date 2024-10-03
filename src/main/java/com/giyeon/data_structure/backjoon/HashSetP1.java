package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.HashSet;

public class HashSetP1{

    public static void main(String[] args) throws IOException {

        HashSet<Integer> integers = new HashSet<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //처음 n값 받아오기
        int inputNumber = Integer.parseInt(br.readLine());

        //n의 수의 정수들을 받아오기
        String initalArr = br.readLine();

        //배열로 바꾸기
        String[] splitInitalArr = initalArr.split(" ");

        //글자를 수로 바꾸어서 HashSet에 집어넣기
        for (String s : splitInitalArr) {
            Integer i = Integer.parseInt(s);
            integers.add(i);
        }

        //비교할거 크기 받아오기 -> 배열만들어서 집어넣기
        int readM = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] splitedS = s.split(" ");
        Integer[] integersOfM = new Integer[readM];

        //받은 수들을 int 배열에 집어넣은
        for (int i = 0; i < readM; i++) {
            int i1 = Integer.parseInt(splitedS[i]);
            integersOfM[i] = i1;
        }

        //이제 하나씩 비교하고 출력을 하면 된다.
        for (Integer integer : integersOfM) {
            boolean contains = integers.contains(integer);
            if (contains) {
                bw.write("1"+"\n");
            }else {
                bw.write("0"+"\n");
            }

        }
        bw.flush();

        br.close();
        bw.close();


    }

}
