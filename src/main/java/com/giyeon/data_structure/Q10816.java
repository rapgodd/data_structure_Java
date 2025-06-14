package com.giyeon.data_structure;

import java.util.*;
import java.io.*;


public class Q10816 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int cardCount = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<cardCount; i++){

            int cardVal = Integer.parseInt(st.nextToken());
            boolean hasKey = map.containsKey(cardVal);

            if(hasKey){
                int amount = map.get(cardVal);
                int newAmount = amount + 1;
                map.put(cardVal,newAmount);
            }else{
                map.put(cardVal,1);
            }

        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i =0; i<M; i++){

            int key = Integer.parseInt(st1.nextToken());
            boolean hasKey = map.containsKey(key);
            if(hasKey){
                int amount = map.get(key);
                sb.append(amount).append(" ");
            }else{
                sb.append("0").append(" ");
            }

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
