package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Q10828 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {

            String command = br.readLine();

            if(command.startsWith("push")){
               int num = Integer.parseInt(command.substring(5));
               stack.offerFirst(num);
            }else if(command.equals("pop")){
               if(stack.isEmpty()){
                   sb.append("-1"+"\n");
               }else{
                   sb.append(stack.pollFirst()+"\n");
               }
            }else if(command.equals("size")){
                sb.append(stack.size()+"\n");
            }else if(command.equals("empty")){
                if(stack.isEmpty()){
                    sb.append("1"+"\n");
                }else{
                    sb.append("0"+"\n");
                }
            }else{
                if(stack.isEmpty()){
                    sb.append("-1"+"\n");
                }else{
                    sb.append(stack.peekFirst()+"\n");
                }
            }

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
