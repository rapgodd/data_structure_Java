package com.giyeon.data_structure.backjoon.implementation;

import javax.swing.*;
import java.io.*;

public class Q6603 {

    public static int K;
    public static boolean first = true;
    public static String[] S;
    public static String[] currentArr = new String[6];


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        while(true){

            String givenData = br.readLine();

            if(!first){
                sb.append("\n");
            }else{
                first = false;
            }

            if(givenData.equals("0")){
                break;
            }

            String[] KWithS = givenData.split(" ");
            K = Integer.parseInt(KWithS[0]);
            S = new String[K];

            for(int i = 1; i<=K; i++){
                S[i - 1] = KWithS[i];
            }

            //메서드 호출 백트래킹(시작지점,얼마나 넣었는지,현재까지 넣은 배열)
            backTrack(0, 0, currentArr, sb);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static void backTrack(int start, int index, String[] currentArr, StringBuilder sb){

        if (index == 6) {

            for(int i = 0; i<6; i++){
                sb.append(currentArr[i]);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i<K; i++){
            currentArr[index] = S[i];
            backTrack(i + 1, index + 1, currentArr, sb);
        }

    }


}
