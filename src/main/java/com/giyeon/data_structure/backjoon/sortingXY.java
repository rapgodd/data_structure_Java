package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class sortingXY {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer initialLoop  = Integer.parseInt(br.readLine());

        HashMap<Integer, List<Integer>> integerListHashMap = new HashMap<>();

        for(int i = 0; i<initialLoop; i++){

            String s = br.readLine();
            String[] split = s.split(" ");
            String firstNum = split[0];
            String secondNum = split[1];

            if (integerListHashMap.get(Integer.parseInt(firstNum)) == null) {
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(Integer.parseInt(secondNum));
                integerListHashMap.put(Integer.parseInt(firstNum), integers);
            }else {
                List<Integer> integers = integerListHashMap.get(Integer.parseInt(firstNum));
                integers.add(Integer.parseInt(secondNum));
                integerListHashMap.put(Integer.parseInt(firstNum), integers);
            }

        }

        //set으로는 정렬을 할 수 없으므로 List로 변환한다.
        Set<Integer> integers = integerListHashMap.keySet();
        ArrayList<Integer> keysList = new ArrayList<>(integers);
        Collections.sort(keysList);


        //결과 담는 곳
        StringBuilder sb = new StringBuilder();

        for (Integer key : keysList) {
            List<Integer> values = integerListHashMap.get(key);
            if (values.size() > 1) {
                Collections.sort(values);
                for (Integer value : values) {
                    String result = key + " " + value;
                    sb.append(result+"\n");
                }
            }else {
                sb.append(key + " " + values.get(0)+"\n");
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

}
