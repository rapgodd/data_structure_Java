package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class BJ12865 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        //행 열 받아오기
        String[] a = br.readLine().split(" ");
        int n = Integer.parseInt(a[0]);
        int kLimit = Integer.parseInt(a[1]);

        //DP를 사용해서 행열 채우기
        int[][] dp = new int[n+1][kLimit+1];
        fillDp(br, n, kLimit, dp);

        int result = dp[n][kLimit];

        sb.append(result);
        String resultAnswer = sb.toString();
        bw.write(resultAnswer);
        bw.flush();
        bw.close();
        br.close();
    }

    private static void fillDp(BufferedReader br, int n, int kLimit, int[][] dp) throws IOException{
        //행 열 인덱스가 0인경우 0으로 미리 채움
//        for(int kg = 0; kg<=kLimit; kg++ ){
//            dp[0][kg] = 0;
//        }
//
//        for(int i = 0; i<=n; i++){
//            dp[i][0] = 0;
//        }

        //n개 차례로 받으면 그거 집어 넣는다.
        for(int i = 1; i<=n; i++){

            //무게랑 중요도 가져오기
            String[] split = br.readLine().split(" ");
            int weight = Integer.parseInt(split[0]);
            int value = Integer.parseInt(split[1]);

            for(int kg  = 1; kg <= kLimit; kg++){
                //주어진 아이템 선택 안함
                int a = dp[i-1][kg];

                //주어진 아이템 선택 함
                //무게 제한이 아이템 무게보다 크면 선택 안하고 위에 값 받아옴
                int b = a;
                if(kg>=weight){
                    b = dp[i - 1][kg - weight] + value;
                }

                if(a>=b){
                    dp[i][kg] = a;
                }else{
                    dp[i][kg] = b;
                }
            }
        }

    }

}
