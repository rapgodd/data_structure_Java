package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Test10773 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loopTotalAmount = Integer.parseInt(br.readLine());
        int totalSum  = getSumOfNumsInGivenNums(br,loopTotalAmount);

        bw.write(String.valueOf(totalSum));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int getSumOfNumsInGivenNums(BufferedReader br,int loopTotalAmount) throws IOException{

        Deque<Integer> holdValidGivenNumDeque = new ArrayDeque<>();

        for(int i = 0; i < loopTotalAmount; i++){
             int givenNum = Integer.parseInt(br.readLine());

             if(givenNum==0){
                 holdValidGivenNumDeque.pollLast();
             }else{
                 holdValidGivenNumDeque.offerLast(givenNum);
             }

        }

        int totalSum = 0;

        int givenNumAmount = holdValidGivenNumDeque.size();
        for(int i=0; i<givenNumAmount; i++){
            int component = holdValidGivenNumDeque.pollLast();
            totalSum += component;
        }

        return totalSum;
    }

}
