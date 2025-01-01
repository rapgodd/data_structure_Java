package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Test2178 {

    static int movingCount=0;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] rowAndColumn = br.readLine().split(" ");
        int row = Integer.parseInt(rowAndColumn[0]);
        int column = Integer.parseInt(rowAndColumn[1]);

        int[][] map = new int[row+1][column+1];

        String[] holdingMapStringRowTemp = new String[row];

        for(int i = 0; i<row; i++){
            String line = br.readLine();
            holdingMapStringRowTemp[i] = line;
        }

        fillMap(map, row, column, holdingMapStringRowTemp);

        int shortestPathCount = findShortestPathCount(map, row, column);
        bw.write(String.valueOf(shortestPathCount));
        bw.flush();
        bw.close();
        br.close();

    }

    private static int findShortestPathCount(int[][] map, int row, int column){

        Deque<int[]> willHandlePathListDeque = new ArrayDeque<>();
        Set<List<Integer>> arrIfThePathIsAlreadyHandled = new HashSet<>();

        willHandlePathListDeque.offerLast(new int[]{1, 1});

        boolean finishLoop = true;

        while(finishLoop){
            if(handlePathInDeque(willHandlePathListDeque,map,arrIfThePathIsAlreadyHandled,row,column)==false){
                finishLoop = false;
            }
        }

        return movingCount;

    }

    private static boolean handlePathInDeque(Deque<int[]> willHandlePathListDeque
                    ,int[][] map,Set<List<Integer>> arrIfThePathIsAlreadyHandled,
                    int row, int column){


        int[] pathNeedToBeHandled = willHandlePathListDeque.pollLast();

        //인접 경로가 지나갈수 있는 경로이고
        if(map[pathNeedToBeHandled[0]+1][pathNeedToBeHandled[1]]==1){


            //의미:이전에 처리하지 않은 경로라면
            if(!arrIfThePathIsAlreadyHandled.contains(List.of(pathNeedToBeHandled[0]+1,pathNeedToBeHandled[1]))){

                // 목적지가 아니라면
                if(pathNeedToBeHandled[0]+1==row
                        && pathNeedToBeHandled[1]==column){
                    movingCount++;
                    return true;
                }

                //이전에 처리한 적이 없으니 큐에 처리할 경로라고 결정하고 집어넣는다
                willHandlePathListDeque.offerLast(new int[]{pathNeedToBeHandled[0]+1,pathNeedToBeHandled[1]});
            }

        }


        if(map[pathNeedToBeHandled[0]-1][pathNeedToBeHandled[1]]==1){

            // 목적지가 아니라면
            if(pathNeedToBeHandled[0]-1==row
                    && pathNeedToBeHandled[1]==column){
                movingCount++;
                return true;
            }

            if(!arrIfThePathIsAlreadyHandled.contains(List.of(pathNeedToBeHandled[0]-1,pathNeedToBeHandled[1]))){
                //이전에 처리한 적이 없으니 큐에 처리할 경로라고 결정하고 집어넣는다
                willHandlePathListDeque.offerLast(new int[]{pathNeedToBeHandled[0]-1,pathNeedToBeHandled[1]});
            }

        }


        if(map[pathNeedToBeHandled[0]][pathNeedToBeHandled[1]+1]==1){

            // 목적지가 아니라면
            if(pathNeedToBeHandled[0]==row
                    && pathNeedToBeHandled[1]+1==column){
                movingCount++;
                return true;
            }

            if(!arrIfThePathIsAlreadyHandled.contains(List.of(pathNeedToBeHandled[0],pathNeedToBeHandled[1]+1))){
                //이전에 처리한 적이 없으니 큐에 처리할 경로라고 결정하고 집어넣는다
                willHandlePathListDeque.offerLast(new int[]{pathNeedToBeHandled[0],pathNeedToBeHandled[1]+1});
            }

        }


        if(map[pathNeedToBeHandled[0]][pathNeedToBeHandled[1]-1]==1){

            // 목적지가 아니라면
            if(pathNeedToBeHandled[0]==row
                    && pathNeedToBeHandled[1]-1==column){
                movingCount++;
                return true;
            }

            if(!arrIfThePathIsAlreadyHandled.contains(List.of(pathNeedToBeHandled[0],pathNeedToBeHandled[1]-1))){
                //이전에 처리한 적이 없으니 큐에 처리할 경로라고 결정하고 집어넣는다
                willHandlePathListDeque.offerLast(new int[]{pathNeedToBeHandled[0],pathNeedToBeHandled[1]-1});
            }

        }


            movingCount++;
            return true;

    }

    private static void fillMap(int[][] map, int row, int column, String[] holdingMapStringRowTemp){

        for(int i = 0; i<row; i++){

            String[] eachRowToStringArr = holdingMapStringRowTemp[i].split("");

            for(int j = 0; j<column; j++){
                map[i+1][j+1] = Integer.parseInt(eachRowToStringArr[j]);
            }

        }

        for(int i = 0; i<=column; i++){
            map[0][i] = 0;
        }

        for(int j = 0; j<=row; j++){
            map[j][0] = 0;
        }

    }

}
