package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q3184 {
    static boolean[][] visited;
    static int r;
    static int c;
    static char[][] yard;
    static int[] dx = new int[]{1, -1, 0, 0};
    static int[] dy = new int[]{0, 0, 1, -1};


    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalSheep=0;
        int totalWolves=0;

        String s = br.readLine();
        String[] a = s.split(" ");
        r = Integer.parseInt(a[0]);
        c = Integer.parseInt(a[1]);

        yard = new char[r][c];
        visited = new boolean[r][c];

        //yard 이차원 배열 채우기.
        for (int i = 0; i < r; i++) {
            String line = br.readLine();
            for (int j = 0; j < c; j++) {
                yard[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if(!visited[i][j]&&yard[i][j]!='#'){

                    int[] result = bfs(i, j);
                    int sheepCount = result[0];
                    int wolfCount = result[1];
                    boolean isOpen = (result[2]==1);

                    if(!isOpen){
                        if(sheepCount>wolfCount){
                            totalSheep += sheepCount;
                        }else{
                            totalWolves += wolfCount;
                        }
                    }
                }

            }
        }

        bw.write(totalSheep + " " + totalWolves);
        bw.flush();
        bw.close();
        br.close();
    }

    private static int[] bfs(int startR, int startC) {

        ArrayDeque<int[]> queue = new ArrayDeque<>();
        visited[startR][startC] = true;
        queue.offer(new int[] {startR, startC});

        int sheepCount = 0;
        int wolfCount = 0;
        boolean isOpen = false;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cr = cur[0], cc = cur[1];

            // 현재 칸에 양/늑대가 있으면 카운트
            if (yard[cr][cc] == 'o') sheepCount++;
            if (yard[cr][cc] == 'v') wolfCount++;

            // 만약 가장자리 칸이라면 '열린(open) 영역'으로 표시
            if (cr == 0 || cr == r - 1 || cc == 0 || cc == c - 1) {
                isOpen = true;
            }

            // 상하좌우 탐색
            for (int i = 0; i < 4; i++) {
                int nr = cr + dx[i];
                int nc = cc + dy[i];

                // 범위 체크 & 울타리 제외 & 미방문 칸
                if (nr >= 0 && nr < r && nc >= 0 && nc < c) {
                    if (!visited[nr][nc] && yard[nr][nc] != '#') {
                        visited[nr][nc] = true;
                        queue.offer(new int[]{nr, nc});
                    }
                }
            }
        }

        // isOpen을 정수로 변환(1 = true, 0 = false)
        return new int[] {sheepCount, wolfCount, isOpen ? 1 : 0};


    }


}
