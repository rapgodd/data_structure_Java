package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Q2075 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Long> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i =0; i<N; i++){

            String[] line = br.readLine().split(" ");

            for(int j =0; j<N; j++){
                queue.offer(Long.parseLong(line[j]));
            }
        }

        for(int i =1; i<=N; i++){

            if(i==N){
                bw.write(String.valueOf(queue.poll()));
            }else{
                queue.poll();
            }

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
