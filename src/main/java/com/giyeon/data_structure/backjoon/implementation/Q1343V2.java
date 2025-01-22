package com.giyeon.data_structure.backjoon.implementation;

import java.util.*;
import java.io.*;


public class Q1343V2 {

    public static void main(String[] args) throws IOException{

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String sentence = br.readLine();
        int i = 0;

        while (i < sentence.length()) {

            if(sentence.charAt(i)=='.'){
                sb.append(".");
                i++;
            }else{

                int xCount = 0;
                while (i < sentence.length()&&sentence.charAt(i)!='.') {
                    xCount += 1;
                    i++;
                }

                int fourCount = xCount / 4;
                for(int j = 0; j<fourCount; j++){
                    sb.append("AAAA");
                }

                int bCount = xCount%4;
                if (bCount == 2) {
                    sb.append("BB");
                }else if(bCount==1||bCount==3){
                    bw.write(String.valueOf(-1));
                    bw.flush();
                    bw.close();
                    br.close();
                    return;
                }


            }

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
