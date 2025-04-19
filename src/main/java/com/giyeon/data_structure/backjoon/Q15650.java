package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q15650 {

    static int N;
    static int M;
    static int[] arr;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        // depth, previousIndex(pi)
        backTrack(1, 1,sb);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    public static void backTrack(int depth, int pi, StringBuilder sb){

        if(depth>M){
            for(int val: arr){
                sb.append(val+" ");
            }
            sb.append("\n");
            return;
        }


        for(int i = pi; i<=N; i++){

            arr[depth - 1] = i;
            backTrack(depth + 1, i + 1, sb);

        }

    }
}
