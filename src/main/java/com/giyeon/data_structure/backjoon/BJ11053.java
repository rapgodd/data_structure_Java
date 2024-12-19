package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class BJ11053 {

    public static void main(String[] arg) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        //배열의 크기 받는다
        int n = Integer.parseInt(br.readLine());

        //배열의 요소를 받아서 배열을 만든다.
        int[] a = new int[n];
        String[] arr = br.readLine().split(" ");

        //String -> int -> 배열에 담기 o(n)
        for(int i =0; i < n; i++){
            a[i] = Integer.parseInt(arr[i]);
        }

        //다이나믹 프로그래밍 배열 생성 o(n)
        int[] dp = new int[n];
        for(int i =0; i<n; i++){
            dp[i] = 1;
        }

        //a[i]를 부분 수열의 마지막 원소로 가지고 있는 부분 수열의 크기 = dp[i]
        fillDpArr(a,dp,n);
        int result = dp[n-1];
        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static void fillDpArr(int[] a, int[] dp, int n){


        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(a[i]<a[j]){
                    if(dp[j]<=dp[i]){
                        dp[j] = dp[i]+1;
                    }
                }
            }
        }

        //오름차순 정렬
        Arrays.sort(dp);
    }
}
