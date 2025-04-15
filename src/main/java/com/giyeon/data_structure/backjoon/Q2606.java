package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Q2606 {

    public static int COUNT=0;
    public static int computerAmount;
    public static int[][] comArr;
    public static boolean[] comBooleanArr;


    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //총 컴퓨터의 수
        computerAmount = Integer.parseInt(br.readLine());
        comArr = new int[computerAmount + 1][computerAmount+1];
        comBooleanArr = new boolean[computerAmount+1];

        //이차원 배열 채워넣기
        int loop = Integer.parseInt(br.readLine());
        for(int i =0; i<loop; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int com1 = Integer.parseInt(st.nextToken());
            int com2 = Integer.parseInt(st.nextToken());

            comArr[com1][com2] = com2;
            comArr[com2][com1] = com1;

        }

        //재귀 함수
        comBooleanArr[1]=true;
        dfs(1);

        //출력
        bw.write(String.valueOf(COUNT));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int row) {

        for(int i =1; i<computerAmount + 1; i++ ){

           if(comArr[row][i]!=0&&!comBooleanArr[i]){
               COUNT += 1;
               comBooleanArr[i] = true;
               dfs(i);
           }

        }

    }

}
