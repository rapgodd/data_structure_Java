package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q15649 {

    static int givenNumLength;
    static int givenArrLength;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        givenNumLength = Integer.parseInt(st.nextToken());
        givenArrLength = Integer.parseInt(st.nextToken());

        //깊이,sb,수열
        dfs(1,sb,new int[givenArrLength+1], new boolean[givenNumLength+1]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    public static void dfs(int depth, StringBuilder sb,int[] arr, boolean[] boolArr) {
        //주어진 수열의 크기만큼 생성했으면 Return
        if(depth==givenArrLength+1){

            for(int i =1; i<givenArrLength+1; i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
            return;
        }

        //수열을 생성한다
        for(int i = 1; i<=givenNumLength; i++){

            if(!boolArr[i]){
                arr[depth] = i;
                boolArr[i] = true;
                int newDepth = depth + 1;
                dfs(newDepth, sb, arr, boolArr);
                boolArr[i] = false;
            }

        }

    }


}
