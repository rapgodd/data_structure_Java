package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Test21736 {

    static int peopleAmountHeCanMeet=0;
    static int[] dx = new int[]{-1,1,0,0};
    static int[] dy = new int[]{0,0,-1,+1};

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] NM = br.readLine().split(" ");
        int row = Integer.parseInt(NM[0]);
        int column = Integer.parseInt(NM[1]);

        String[][] map = new String[row][column];
        int[] locationOfI = new int[2];

        for(int i = 0; i<row; i++){
            String line = br.readLine();
            String[] wallOrPeopleOrI = line.split("");

            for(int j =0; j<column; j++){
                map[i][j] = wallOrPeopleOrI[j];

                //주어진 입력에 맞추어서 캠퍼스 지도를 채우다가 I를 보면 그 좌표를 따로 저장한다.
                if(wallOrPeopleOrI[j].equals("I")){
                    locationOfI[0] = i;
                    locationOfI[1] = j;
                }
            }
        }

        getHowManyPeopleHeCanMeet(locationOfI, map,row,column);

        if(peopleAmountHeCanMeet==0){
            bw.write("TT");
            bw.flush();
            bw.close();
            br.close();
        }else{
            bw.write(String.valueOf(peopleAmountHeCanMeet));
            bw.flush();
            bw.close();
            br.close();
        }

    }

    private static void getHowManyPeopleHeCanMeet(int[] locationOfI, String[][] map, int row, int column) {

        Deque<int[]> nodeWillBeHandled = new ArrayDeque<>();
        boolean[][] visitedOrNot = new boolean[row][column];

        nodeWillBeHandled.offerLast(locationOfI);
        visitedOrNot[locationOfI[0]][locationOfI[1]] = true;

        while (!nodeWillBeHandled.isEmpty()) {
            int[] locationNode = nodeWillBeHandled.pollFirst();
            for (int i = 0; i < 4; i++) {
                int newX = locationNode[0] + dx[i];
                int newY = locationNode[1] + dy[i];

                //인접노드가 캠퍼스 안이면서 방문 안한 인접노드이면서 벽이 아닌 경우 큐에 집어 넣는다
                if(newX>=0&&newX<row && newY<column&&newY>=0
                        && !visitedOrNot[newX][newY]
                        && !map[newX][newY].equals("X")){
                    nodeWillBeHandled.offerLast(new int[]{newX, newY});
                    visitedOrNot[newX][newY] = true;

                    if(map[newX][newY].equals("P")){
                        peopleAmountHeCanMeet += 1;
                    }
                }
            }
        }
    }

}
