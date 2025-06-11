package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class BJ2210 {

    public static int[][] arr;
    public static Set<String> set = new HashSet<>();
    public static int[] dx = new int[]{-1, 1, 0, 0};
    public static int[] dy = new int[]{0, 0, 1, -1};

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 5*5 판 읽어 와서 배열에 집어넣기.
        arr = new int[5][5];

        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0; j<5; j++){
                int token = Integer.parseInt(st.nextToken());
                arr[i][j] = token;
            }

        }

        // 5*5 좌표 돌면서 dfs호출
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                dfs(i,j,1,String.valueOf(arr[i][j]));
            }
        }

        bw.write(String.valueOf(set.size()));
        bw.flush();
        bw.close();
        br.close();

    }

    public static void dfs(int i, int j, int depth, String result){

        if(depth==6){
            set.add(result);
        }else{

            for(int k=0; k<4; k++){
                int newI = i + dx[k];
                int newJ = j + dy[k];

                if(newI>=0 && newI<5 && newJ>=0 && newJ<5){
                   String a = result + arr[newI][newJ];
                   dfs(newI, newJ, depth + 1, a);
                }

            }

        }

    }

}
