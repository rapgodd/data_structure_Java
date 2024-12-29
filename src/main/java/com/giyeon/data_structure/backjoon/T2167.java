package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class T2167 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] horizonAndVertical = br.readLine().split(" ");

        int horizonLineAmount = Integer.parseInt(horizonAndVertical[0]);
        int verticalLineAmount = Integer.parseInt(horizonAndVertical[1]);

        int[][] numArr = new int[horizonLineAmount][verticalLineAmount];

        for(int i = 0; i<horizonLineAmount; i++){
            String[] eachLineOfNumArr = br.readLine().split(" ");

            for(int j = 0; j<verticalLineAmount; j++){
                numArr[i][j] = Integer.parseInt(eachLineOfNumArr[j]);

            }
        }

        int testCaseNum = Integer.parseInt(br.readLine());

        for(int i = 0; i<testCaseNum; i++){
            int sum = 0;
            String[] locations = br.readLine().split(" ");

            int firstX = Integer.parseInt(locations[0])-1;
            int firstY = Integer.parseInt(locations[1])-1;

            int secondX = Integer.parseInt(locations[2])-1;
            int secondY = Integer.parseInt(locations[3])-1;

            for(int j = firstX; j<=secondX; j++){
                for(int w = firstY; w<=secondY; w++){
                    sum += numArr[j][w];
                }
            }
            sb.append(sum+"\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
