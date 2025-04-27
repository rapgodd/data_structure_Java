package com.giyeon.data_structure.backjoon;

import java.io.*;

public class Q2839 {

    public static void main(String[] args) throws IOException{

        // N kg 의 값
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[5001];

        arr[3] = 1;
        arr[4] = -1;
        arr[5] = 1;
        arr[6] = 2;
        arr[7] = -1;

        for(int i = 8; i<N+1; i++){

            if(arr[i - 3]!=-1&&arr[i - 5]!=-1){
                arr[i] = Math.min(arr[i - 3], arr[i - 5])+1;
            }else if(arr[i - 3]==-1){
                arr[i] = arr[i - 5] + 1;
            }else if(arr[i-5]==-1){
                arr[i] = arr[i - 3] + 1;
            }else{
                arr[i] = -1;
            }

        }

        bw.write(String.valueOf(arr[N]));
        bw.flush();
        bw.close();
        br.close();

    }

}
