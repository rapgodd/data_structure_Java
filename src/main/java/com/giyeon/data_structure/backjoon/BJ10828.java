package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class BJ10828 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        Deque<String> deque = new ArrayDeque<>();

        for(int i =0; i<num; i++){
            String command = br.readLine();

            if(command.contains("push")){
                String[] split = command.split(" ");
                String component = split[1];

                deque.offerLast(component);
            }else if(command.contains("top")){

                if(deque.peekLast()==null){
                    sb.append(-1+"\n");
                }else{
                    String component = deque.peekLast();
                    sb.append(component + "\n");
                }

            }else if(command.contains("pop")){

                if(deque.peekLast()==null){
                    sb.append(-1+"\n");
                }else{
                    String component = deque.pollLast();
                    sb.append(component + "\n");
                }
            }else if(command.contains("empty")){
                if(deque.peekLast()==null){
                    sb.append(1+"\n");
                }else{
                    sb.append(0 + "\n");
                }
            }else{
                int size = deque.size();
                sb.append(size + "\n");
            }
        }

        String answer = sb.toString();
        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();

    }

}
