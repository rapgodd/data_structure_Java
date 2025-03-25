package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Queue18258 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int count = Integer.parseInt(br.readLine());

        for(int i =0; i<count; i++){

            String command = br.readLine();
            if(command.startsWith("push")){

                queue.offerFirst(Integer.parseInt
                        (command.substring(5)));

            }else if(command.equals("pop")){

                if(queue.size()>0){
                    int val = queue.pollLast();
                    sb.append(val+"\n");
                }else{
                    sb.append("-1"+"\n");
                }

            }else if(command.equals("size")){

                sb.append(queue.size()+"\n");

            }else if(command.equals("empty")){

                if(queue.isEmpty()){
                    sb.append(1+"\n");
                }else{
                    sb.append(0+"\n");
                }

            }else if(command.equals("front")){

                if(queue.isEmpty()){
                    sb.append(-1+"\n");
                }else{
                    sb.append(queue.peekLast()+"\n");
                }

            }else if(command.equals("back")){

                if(queue.isEmpty()){
                    sb.append(-1+"\n");
                }else{
                    sb.append(queue.peekFirst()+"\n");
                }


            }

        }

        String answer = sb.toString();
        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();
    }

}
