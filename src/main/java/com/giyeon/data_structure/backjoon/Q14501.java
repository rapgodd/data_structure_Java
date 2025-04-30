package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q14501 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // N값을 받아오기
        int N = Integer.parseInt(br.readLine());

        // 배열 채워 넣기
        int[][] givenDataArr = new int[2][N+1];

        for(int i=1; i<N+1; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            //상담 기간
            givenDataArr[0][i] = Integer.parseInt(st.nextToken());
            //수익
            givenDataArr[1][i] = Integer.parseInt(st.nextToken());
        }

        // 점화식을 세우고 최적해를 구하는 과정을 적는다
        // dp[i] : i일 부터 N일 까지 상담으로 벌 수 있는 최대의 이익
        int[] dp = new int[N+2];
        dp[N+1] = 0;

        for(int i = N; i>=1; i--){

            int Ti = givenDataArr[0][i];

            if(i+(Ti-1)>N){
                dp[i] = dp[i + 1];
            }else{
                dp[i] = Math.max(dp[i + 1], dp[i + Ti] + givenDataArr[1][i]);
            }

        }

        bw.write(String.valueOf(dp[1]));
        bw.flush();
        bw.close();
        br.close();
    }

}
