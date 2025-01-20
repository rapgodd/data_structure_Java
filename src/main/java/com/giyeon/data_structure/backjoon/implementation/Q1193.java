package com.giyeon.data_structure.backjoon.implementation;

import java.util.*;
import java.io.*;

public class Q1193 {
    //[0][0] -> [0][1] -> [1][0] -> [2][0] -> [1][1] -> [0][2] -> [0][3] -> [1][2] -> [2][1] -> [3][0] '''

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int givenNum = Integer.parseInt(br.readLine());
        int loopCount = 0;

        // loopCount짝수면 오른쪽 홀수면 왼쪽
        // givenNum-1 만큼 loopCount에서 빼서 1+(givenNum-1)/loopcount-(givenNum-1) 이렇게 만들어라

        for (int i = 1; i<1000000; i++) {

            if(givenNum - i<=0){
                loopCount += 1;
                break;
            }else{
                givenNum -= i;
                loopCount += 1;
            }

        }

        if(loopCount%2==0){
            int a = 1 + (givenNum - 1);
            int b = loopCount-(givenNum-1);
            String resultA = String.valueOf(a);
            String resultB = String.valueOf(b);
            String result = resultA + "/" + resultB;
            sb.append(result);
        }else{
            int a = 1 + (givenNum - 1);
            int b = loopCount-(givenNum-1);
            String resultA = String.valueOf(a);
            String resultB = String.valueOf(b);
            String result = resultB + "/" + resultA;
            sb.append(result);
//            int result = loopCount-(givenNum-1) / 1+(givenNum-1);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }

}
