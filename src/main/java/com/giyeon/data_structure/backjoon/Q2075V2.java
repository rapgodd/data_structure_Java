package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q2075V2 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Long> queue = new PriorityQueue<>();

        for(int i =0; i<N; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j =0; j<N; j++){
                long newVal = Long.parseLong(st.nextToken());
                if(queue.size()<N){
                    queue.offer(newVal);
                }else if(queue.peek()<newVal){
                    queue.poll();
                    queue.offer(newVal);
                }
            }


        }
        bw.write(String.valueOf(queue.poll()));
        bw.flush();
        bw.close();
        br.close();

    }

}
