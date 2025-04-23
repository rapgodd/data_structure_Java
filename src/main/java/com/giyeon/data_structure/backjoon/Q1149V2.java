package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q1149V2 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 총 집의 개수
        int homeCount = Integer.parseInt(br.readLine());
        int[][] costArr = new int[homeCount][3];

        // 이차원 배열에 값 집어넣기
        for(int i = 0; i<homeCount; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());

            costArr[i][0] = Integer.parseInt(st.nextToken());
            costArr[i][1] = Integer.parseInt(st.nextToken());
            costArr[i][2] = Integer.parseInt(st.nextToken());

        }

        // 빨강 초록 파랑
        int[] resultArr = new int[3];

        resultArr[0] = costArr[0][0];
        resultArr[1] = costArr[0][1];
        resultArr[2] = costArr[0][2];

        for(int i = 1; i<homeCount; i++){

            int a1 = costArr[i][0] + Math.min(resultArr[1],resultArr[2]);
            int a2 = costArr[i][1] + Math.min(resultArr[0],resultArr[2]);
            int a3 = costArr[i][2] + Math.min(resultArr[0],resultArr[1]);

            // resultArr[i] : 해당 루프 이전 까지 값 합의 최솟값 [직전 루프 집의 인덱스는 i]
            resultArr[0] = a1;
            resultArr[1] = a2;
            resultArr[2] = a3;

        }

        Arrays.sort(resultArr);
        bw.write(String.valueOf(resultArr[0]));
        bw.flush();
        bw.close();
        br.close();


    }

}
