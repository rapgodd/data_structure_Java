package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class BJ9251 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String a = br.readLine();
        String b = br.readLine();

        String[] aArr = a.split("");
        String[] bArr = b.split("");

        //다이나믹 프로그래밍 배열 생성
        //인덱스 +1 한 이유는 인덱스가 0일때 역시 인덱스로 점화식을 만들고 싶은데
        //인덱스가 0부터 시작하면 -1이 됨
        int[][] dp = new int[aArr.length+1][bArr.length+1];

        int aLength = aArr.length;
        int bLength = bArr.length;


        for (int i = 1; i<=aLength; i++){
            for(int j = 1; j<=bLength; j++){
                String aComponent = aArr[i-1];
                String bComponent = bArr[j-1];

                //문자열 i번째와 두번째 문자열 j번째가 같지 않을때 -> i-1번째 or j-1번째의 LCS를 가져옴
                if(!aComponent.equals(bComponent)) {
                    int case1 = dp[i - 1][j];
                    int case2 = dp[i][j - 1];

                    if (case1 >= case2) {
                        dp[i][j] = case1;
                    } else {
                        dp[i][j] = case2;
                    }
                //같을때 dp[i-1][j-1]에서 +1을 하면 된다
                }else{
                    dp[i][j] = dp[i-1][j-1]+1;
                }
            }

        }

        int LCS = dp[aLength][bLength];
        sb.append(LCS);
        String answer = sb.toString();
        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();



    }

}
