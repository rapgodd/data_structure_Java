package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Q11279 {

     public static void main(String[] args) throws IOException{

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         StringBuilder sb = new StringBuilder();
         PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

         int totalCount = Integer.parseInt(br.readLine());
         for(int i =0; i<totalCount; i++){
             int line = Integer.parseInt(br.readLine());

             if(line==0){

                 if(heap.isEmpty()){
                     sb.append(0 + "\n");
                 }else{
                     sb.append(heap.poll()+"\n");
                 }

             }else{

                 heap.offer(line);

             }

         }

         bw.write(sb.toString());
         bw.flush();
         bw.close();
         br.close();
     }

}
