package com.giyeon.data_structure;

import java.io.*;
import java.util.*;

public class Q15651 {

    static int N;
    static int M;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[] arr = new int[M];

        backTrack(arr,0,sb);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }

    public static void backTrack(int[] arr, int depth, StringBuilder sb){

        if(depth>=M){

            for(int i : arr){

                sb.append(i).append(" ");

            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i<=N; i++){

            arr[depth] = i;
            backTrack(arr,depth+1,sb);

        }


    }
}
