package com.giyeon.data_structure;

import java.util.*;
import java.io.*;

public class Q1149 {

    static int[][] colorCostArr;
    static boolean[] previousChosenColor;
    static PriorityQueue<Integer> costList;
    static int homeAmount;
    static int previousIndex=0;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        homeAmount = Integer.parseInt(br.readLine());
        colorCostArr = new int[homeAmount][3];

        //colorCostArr 채워 넣기
        for(int i =0; i<homeAmount; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0; j<3; j++){
                colorCostArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        //[false,false,false]
        //[빨강,  초록,   파랑]
        previousChosenColor = new boolean[3];

        //ArrayList
        costList = new PriorityQueue<>();

        //인자 : 몇번째 집, 비용
        collectCosts(0,0,true);

        int result = costList.poll();
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();

    }

    public static void collectCosts(int depth, int cost,boolean init) {

        // Depth가 homeAmount보다 크거나 같으면 return
        if(depth>=homeAmount){
            costList.add(cost);
            return;
        }

        for(int i =0; i<3; i++){

            // 1. 불리안 배열 값이 false이면 true로 바꾸고
            //    previous index 에 해당하는 값을 true에서 -> false로 바꾸고 다음 메서드를 호출한다.
            if(!previousChosenColor[i]){
                int original = previousIndex;
                previousChosenColor[i] = true;
                if(!init){
                    previousChosenColor[original]=false;
                }
                previousIndex = i;


                collectCosts(depth+1,cost+colorCostArr[depth][i],false);


                previousChosenColor[i] = false;
                if(!init){
                    previousChosenColor[original]=true;
                    previousIndex = original;
                }

            }

        }
    }

}
