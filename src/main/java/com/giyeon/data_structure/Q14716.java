package com.giyeon.data_structure;

import java.io.*;
import java.util.*;

public class Q14716 {

    public static int[] dx = new int[]{-1,1,0,0,-1,-1,1,1};
    public static int[] dy = new int[]{0,0,1,-1,1,-1,1,-1};
    public static int count = 0;
    public static int N;
    public static int M;
    public static boolean[][] boolArr;
    public static int[][] arr;


    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // n,m
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        boolArr = new boolean[N][M];

        for(int i=0; i<N; i++){

            StringTokenizer line = new StringTokenizer(br.readLine());

            for(int j=0; j<M; j++){

                int val = Integer.parseInt(line.nextToken());

                // 1. arr에 그 값을 집어 넣자.
                // 2. boolArr에 val이 1이면 true를 넣자.
                arr[i][j] = val;
                if(val==1){
                    boolArr[i][j] = true;
                }

            }

        }

        ArrayDeque<int[]> queue = new ArrayDeque<>();

        for(int i=0; i<N; i++){

            for(int j=0; j<M; j++){

                // arr을 돌면서 1이면 그 값을 기준으로 해서 bfs를 한다.
                // bfs끝나면 count+1
                if(arr[i][j] == 1 && boolArr[i][j]){

                    queue.offerFirst(new int[]{i,j});
                    bfs(queue);
                    count++;
                }

            }

        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();

    }

    public static void bfs(ArrayDeque<int[]> queue) {

        while(!queue.isEmpty()){
            int[] node = queue.pollLast();
            int y = node[0];
            int x = node[1];

            for(int i =0; i<8; i++){

                int newY = y+dy[i];
                int newX = x+dx[i];

                if(newX>=0&&newX<M&&newY>=0&&newY<N&&boolArr[newY][newX]){

                    int[] newNode = new int[]{newY, newX};
                    queue.offerFirst(newNode);
                    boolArr[newY][newX] = false;

                }

            }
        }

    }
}
