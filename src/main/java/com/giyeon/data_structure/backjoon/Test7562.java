package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Test7562 {

    static int destinationX;
    static int destinationY;

    static int[] dy = new int[]{1,-1,2,-2,-2,2,1,-1};
    static int[] dx = new int[]{-2,-2,-1,-1,1,1,2,2};

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int totalTestCaseAmount = Integer.parseInt(br.readLine());

        for(int i = 0; i<totalTestCaseAmount; i++){
            //체스판 길이
            int lengthOfVertAndHori = Integer.parseInt(br.readLine());

            //현재 x좌표 y좌표
            String[] strCurrentNightLocation = br.readLine().split(" ");
            int currentX = Integer.parseInt(strCurrentNightLocation[0]);
            int currentY = Integer.parseInt(strCurrentNightLocation[1]);

            //목적지 x좌표 y좌표
            String[] strDestination = br.readLine().split(" ");
            destinationX = Integer.parseInt(strDestination[0]);
            destinationY = Integer.parseInt(strDestination[1]);

            int minMovingCount = getMinimumMovingCountOfNight(currentX, currentY, lengthOfVertAndHori);
            sb.append(minMovingCount + "\n");

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static int getMinimumMovingCountOfNight(int currentX,int currentY, int lengthOfVertAndHori){

        Deque<int[]> nodeWillBeHandled = new ArrayDeque<>();
        boolean[][] mapIfVisited = new boolean[lengthOfVertAndHori][lengthOfVertAndHori];

        nodeWillBeHandled.offerLast(new int[]{currentX, currentY, 0});
        mapIfVisited[currentX][currentY] = true;

        while (nodeWillBeHandled.size() != 0) {

            int[] willHandleLocation = nodeWillBeHandled.pollFirst();

            //꺼낸 노드와 목적지가 같으면 그대로 반환
            if(willHandleLocation[0]==destinationX&&willHandleLocation[1]==destinationY){
                return willHandleLocation[2];
            }

            //인접 노드가 체스판 범위 안에 있고 방문한 곳 표시한 mapIfVisited에 없으면 노드에 집어 넣음
            for (int i = 0; i < 8; i++) {

                int newX = willHandleLocation[0] + dx[i];
                int newY = willHandleLocation[1] + dy[i];

                if(newX>=0 && newY>=0 && newX<lengthOfVertAndHori && newY<lengthOfVertAndHori && mapIfVisited[newX][newY]==false){
                    nodeWillBeHandled.offerLast(new int[]{newX, newY, willHandleLocation[2] + 1});
                    mapIfVisited[newX][newY] = true;
                }

            }




        }
        return -1;

    }


}
