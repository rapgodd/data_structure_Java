package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class CardCompareSumV2 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int loop = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        fillPriorityQueue(pq, loop, br);
        int totalCountNum = countComparisonNum(pq);

        bw.write(String.valueOf(totalCountNum));
        bw.flush();
        bw.close();
        br.close();

    }

    private static int countComparisonNum(PriorityQueue<Integer> pq){
        int totalComparison= 0;
        int size = pq.size();

        if(pq.size() <= 1){
            return 0;
        }else{
            for(int i = 1; i<size; i++){
                int first = pq.poll();
                int second = pq.poll();

                int sum = first + second;
                totalComparison += sum;
                pq.offer(sum);
            }
        }

        return totalComparison;
    }

    private static void fillPriorityQueue(PriorityQueue<Integer> pq, int loop, BufferedReader br) throws IOException{

        for(int i = 0; i<loop; i++){
            pq.offer(Integer.parseInt(br.readLine()));
        }

    }

}
