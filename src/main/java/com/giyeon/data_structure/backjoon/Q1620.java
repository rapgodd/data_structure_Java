package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Q1620 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] a = br.readLine().split(" ");
        int total = Integer.parseInt(a[0]);
        int question = Integer.parseInt(a[1]);

        HashMap<String, Integer> nameNumMap = new HashMap<>(total);
        HashMap<Integer, String> numNameMap = new HashMap<>(total);

        for(int i =1; i<=total; i++){
            String name = br.readLine();
            nameNumMap.put(name,i);
            numNameMap.put(i,name);
        }

        //해쉬맵을 이용해서 O(1)로 해결한다.
        for(int i =0; i<question; i++){
            String q = br.readLine();

            if(Character.isDigit(q.charAt(0))){
                //소문자로 바꾼것이 기존과 같으면 숫자 문제
                String pocketMonName = numNameMap.get(Integer.parseInt(q));
                sb.append(pocketMonName + "\n");
            }else{
                int pocketMonNum = nameNumMap.get(q);
                sb.append(pocketMonNum + "\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
