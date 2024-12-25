package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Test14719 {

    static int totalWidth = 0;

    /**
     * 고인물 넓이 구하기
     *
     * 이차원 배열 행별로 루프를 돌면서 특정 행 벽이 2개 이상이면 둘의 차를 구해서 넓이로 계산하려한다
     */
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split(" ");
        int verticalLen = Integer.parseInt(arr[0]);
        int horizonLen = Integer.parseInt(arr[1]);


        boolean[][] map = new boolean[verticalLen][horizonLen];

        fillMap(map, br);

        getWidth(map,verticalLen,horizonLen);

        sb.append(totalWidth);
        String result = sb.toString();
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }

    private static void getWidth(boolean[][] map, int verticalLen, int horizonLen) throws IOException{


        for(int i = 0; i < verticalLen; i++){
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            for(int j = 0; j<horizonLen; j++){
                if(map[i][j]){
                    deque.offerLast(j);
                    if(deque.size()==2){
                        int bigIndex = deque.peekLast();
                        int smallIndex = deque.pollFirst();

                        totalWidth += bigIndex-smallIndex-1;
                    }
                }
            }
        }

    }


        private static void fillMap(boolean[][] map, BufferedReader br) throws IOException{

        String[] a = br.readLine().split(" ");
        int len = a.length;
        for(int i=0; i<len; i++){
            int eachVerticalLen = Integer.parseInt(a[i]);
            for(int j = 0; j<eachVerticalLen;j++){
                map[eachVerticalLen-j-1][i] = true;
            }
        }
    }

}
