package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class BJ2178 {

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] NM = br.readLine().split(" ");
        int row = Integer.parseInt(NM[0]);
        int column = Integer.parseInt(NM[1]);

        int[][] map = new int[row][column];

        for(int i = 0; i<row; i++){
            String[] line = br.readLine().split("");
            for(int j = 0; j<column; j++){
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        boolean[][] ifVisitedTheLocation = new boolean[row][column];

        int result = bfs(map, ifVisitedTheLocation, row, column);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();

    }

    private static int bfs(int[][] map, boolean[][] ifVisitedTheLocation, int row, int column) {
        Deque<int[]> willBeHandled = new ArrayDeque<>();
        willBeHandled.offerLast(new int[]{0, 0, 1});
        ifVisitedTheLocation[0][0] = true;

        while (willBeHandled.size() != 0) {

            int[] location = willBeHandled.pollFirst();
            int hori = location[0];
            int verti = location[1];
            int count = location[2];

            //처리할 노드의 인접 노드
            if(hori == row-1 && verti == column-1){
                return count;
            }

            // 상, 하, 좌, 우로 이동 시도
            for(int i = 0; i < 4; i++){
                int newX = hori + dx[i];
                int newY = verti + dy[i];

                // 미로 범위 내에 있고, 이동 가능하며, 아직 방문하지 않았는지 확인
                if(newX >= 0 && newX < row && newY >= 0 && newY < column &&
                        map[newX][newY] == 1 && !ifVisitedTheLocation[newX][newY]){
                    willBeHandled.offer(new int[]{newX, newY, count + 1});
                    ifVisitedTheLocation[newX][newY] = true; // 방문 표시
                }
            }

        }
        return 0;
    }


}
