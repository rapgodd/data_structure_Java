package com.giyeon.data_structure.backjoon.dfsBackJoon;

import java.io.*;
import java.util.*;


public class Test16173 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int mapSize = Integer.parseInt(br.readLine());

        int[][] map = new int[mapSize][mapSize];
        boolean[][] ifVisited = new boolean[mapSize][mapSize];

        fillMap(map, br, mapSize);
        int returnValue = dfs(map, 0, 0,mapSize,ifVisited);
        if (returnValue == -1) {
            bw.write("HaruHaru");
            bw.flush();
            bw.close();
            br.close();
        }else{
            bw.write("Hing");
            bw.flush();
            bw.close();
            br.close();
        }

    }

    private static int dfs(int[][] map, int x, int y,int mapsize,boolean[][] ifVisited) {

        if (ifVisited[x][y] == true) {
            return 1;
        }else{
            int jumpBlockAmount = map[x][y];
            ifVisited[x][y] = true;
            if(jumpBlockAmount==-1){
                return -1;
            }

            if(x + jumpBlockAmount<mapsize){
                int returnValue = dfs(map, x + jumpBlockAmount, y,mapsize,ifVisited);
                if(returnValue==-1){
                    return -1;
                }
            }
            if(y + jumpBlockAmount<mapsize){
                int returnValue = dfs(map, x, y+ jumpBlockAmount,mapsize,ifVisited);
                if(returnValue==-1){
                    return -1;
                }

            }
        }
        return 0;
    }

    private static void fillMap(int[][] map, BufferedReader br,int mapSize) throws IOException{

        for (int i = 0; i < mapSize; i++) {
           String[] oneLine = br.readLine().split(" ");

            for (int j = 0; j < mapSize; j++) {
                map[i][j] = Integer.parseInt(oneLine[j]);
            }

        }

    }



}
