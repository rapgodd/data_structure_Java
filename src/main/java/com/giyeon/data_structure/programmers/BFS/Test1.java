package com.giyeon.data_structure.programmers.BFS;
import java.util.*;

class Test1 {

    static int[] dx = new int[]{-1,+1,0,0};
    static int[] dy = new int[]{0,0,-1,+1};

    public int solution(int[][] maps) {

        Deque<int[]> willBeHandled = new ArrayDeque<>();
        int row = maps.length;
        int column = maps[0].length;

        boolean[][] ifVisited = new boolean[row][column];

        willBeHandled.offerLast(new int[]{0,0,1});
        ifVisited[0][0] = true;

        while(willBeHandled.size()!=0){

            int[] node = willBeHandled.pollFirst();

            if(node[0]==row-1
                    &&node[1]==column-1){
                return node[2];

            }else{
                for(int i =0; i<4; i++){
                    int newX = node[0]+dx[i];
                    int newY = node[1]+dy[i];

                    if(newX>=0&&newX<row
                            &&
                            newY>=0&&newY<column
                            &&
                            ifVisited[newX][newY]==false
                            &&
                            maps[newX][newY]!=0){

                        willBeHandled.offerLast(new int[]{newX,newY,node[2]+1});
                        ifVisited[newX][newY] = true;

                    }

                }


            }

        }


        return -1;
    }
}