package com.giyeon.data_structure.backjoon.dfsBackJoon;

import java.io.*;
import java.util.*;

public class Test2583 {

    public static int areaCount = 0;
    public static int row = 0;
    public static int column = 0;

    public static ArrayList<Integer> areaSize = new ArrayList<>();
    public static int[] dx = new int[]{-1,1,0,0}; //상하좌우
    public static int[] dy = new int[]{0,0,-1,1};

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] NMK = br.readLine().split(" ");
        row = Integer.parseInt(NMK[0]);
        column = Integer.parseInt(NMK[1]);
        int rectangularAmount = Integer.parseInt(NMK[2]);

        boolean[][] ifVisited = new boolean[row][column];

        //문제에서 주어진 직사각형 좌표를 보고 맵에서 false를 true로 바꾸기
        for(int i = 0; i<rectangularAmount; i++){

            String[] rectangularLocation = br.readLine().split(" ");
            int a = Integer.parseInt(rectangularLocation[0]);
            int b = Integer.parseInt(rectangularLocation[1]);
            int c = Integer.parseInt(rectangularLocation[2]);
            int d = Integer.parseInt(rectangularLocation[3]);

            for(int j = a; j<=c-1; j++){
                for(int k = row - d; k<=row - b-1; k++){
                    if(!ifVisited[k][j]){
                        ifVisited[k][j] = true;
                    }
                }
            }

        }

        //map을 돌면서 false인 곳이 있으면 깊이탐색을 하여서 그 곳을 다 true로 바꾸고 count++ && area+1
        for(int i = 0; i < row; i++){
            for (int j = 0; j<column; j++){
                if(!ifVisited[i][j]){
                    getAreaCountAndAreaSize(ifVisited,i,j);
                }
            }
        }
        sb.append(areaCount+"\n");
        Collections.sort(areaSize);
        for(int eachAreaSize : areaSize){
            sb.append(eachAreaSize+" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static void getAreaCountAndAreaSize(boolean[][] ifVisitedMap, int x, int y){

        //int[]에는 x좌표(row) y좌표(column)가 들어가 있다.
        Deque<int[]> willBeProceedNodeStack = new ArrayDeque<>();
        int[] node = new int[]{x, y};

        //깊이탐색 시작점 노드 집어 넣고 방문한곳이라고 표시하고 영역 개수 하나 추가하고 넓이도 해당 깊이탐색에서 추가해야 하니 +1한다.
        willBeProceedNodeStack.offerLast(node);
        ifVisitedMap[x][y] = true;
        areaCount += 1;
        int width = 1;
        while(!willBeProceedNodeStack.isEmpty()){
            int[] willBeHandleSoon = willBeProceedNodeStack.pollLast();

            for(int i=0; i<4; i++){
                    int newX = willBeHandleSoon[0]+dx[i];
                    int newY = willBeHandleSoon[1]+dy[i];

                    if(newX<row&&newX>=0&&newY<column&&newY>=0){//맵의 범위 안에 있으면서
                        if(!ifVisitedMap[newX][newY]){//방문 안한 곳이면
                            ifVisitedMap[newX][newY] = true;
                            width += 1;
                            int[] nearNode = new int[]{newX,newY};
                            willBeProceedNodeStack.offerLast(nearNode);

                    }

                }
            }
        }

        areaSize.add(width);

    }

}
