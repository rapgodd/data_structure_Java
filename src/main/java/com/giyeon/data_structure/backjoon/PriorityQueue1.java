package com.giyeon.data_structure.backjoon;


import java.io.*;
import java.util.PriorityQueue;

public class PriorityQueue1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loopNum = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> ascQueue = new PriorityQueue<>();

        for (int i = 0; i < loopNum; i++) {
            int givenNum = Integer.parseInt(br.readLine());
            if(givenNum>0){
                ascQueue.add(givenNum);
            } else if (givenNum == 0) {
                if (ascQueue.isEmpty()) {
                    bw.write(String.valueOf(0)+"\n");
                }else{
                    Integer poll = ascQueue.poll();
                    bw.write(String.valueOf(poll)+"\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();


    }

}
