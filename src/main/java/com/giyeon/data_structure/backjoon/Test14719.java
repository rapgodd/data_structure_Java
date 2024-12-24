package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Test14719 {

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
    }

    private static void fillMap(boolean[][] map, BufferedReader br) throws IOException{

        br.readLine().split(" ");
        
    }

}
