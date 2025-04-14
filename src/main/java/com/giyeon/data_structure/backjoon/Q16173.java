package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Q16173 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayDeque<int[]> stack = new ArrayDeque<>();

        //이차원 배열 사이즈를 알아와서 그걸 바탕으로 이차원 배열을 생성한다.
        int size = Integer.parseInt(br.readLine());

        //이차원 배열
        int[][] intArr = new int[size][size];
        boolean[][] booleanArr = new boolean[size][size];

        for(int i=0; i<size; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0; j<size; j++){

                intArr[i][j] = Integer.parseInt(st.nextToken());

            }

        }

        //start point : 왼쪽 위
        stack.offerFirst(new int[]{0,0});
        booleanArr[0][0] = true;
        boolean flag = false;

        while(!stack.isEmpty()){
            int[] node = stack.pollFirst();

            int row = node[0];
            int column = node[1];

            if(row==size-1&&column==size-1){
                flag = true;
                break;
            }

            //인덱스가 이차원 배열에서 어떤 값을 가지고 있는지 파악
            int val = intArr[row][column];

            int nextRow = row+val;
            if(nextRow<size&&!booleanArr[nextRow][column]){
                stack.offerFirst(new int[]{nextRow,column});
                booleanArr[nextRow][column] = true;
            }

            int nextColumn = column+val;
            if(nextColumn<size&&!booleanArr[row][nextColumn]){
                stack.offerFirst(new int[]{row,nextColumn});
                booleanArr[row][nextColumn] = true;
            }

        }

        if(flag){
            bw.write("HaruHaru");
        }else{
            bw.write("Hing");
        }

        bw.flush();
        bw.close();
        br.close();


    }

}
