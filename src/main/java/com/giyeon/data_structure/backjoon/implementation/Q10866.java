package com.giyeon.data_structure.backjoon.implementation;

import java.io.*;
import java.util.*;

public class Q10866 {

    public static void main(String[] args) throws IOException{

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new ArrayDeque<>();

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i<count; i++){

            String command = br.readLine();
            String numAfterSpace = null;

            if(command.contains(" ")){
                String[] a = command.split(" ");
                command = a[0];
                numAfterSpace = a[1];
            }

            runCommand(command,sb,deque,numAfterSpace);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static void runCommand(String command, StringBuilder sb, Deque<Integer> deque,String numAfterSpace) {


        if(command.equals("push_front")){
            deque.offerFirst(Integer.parseInt(numAfterSpace));
        }else if(command.equals("push_back")){
            deque.offerLast(Integer.parseInt(numAfterSpace));
        }else if(command.equals("pop_front")){
            if(deque.isEmpty()){
                sb.append(-1+"\n");
            }else{
                sb.append(deque.pollFirst()+"\n");
            }
        }else if(command.equals("pop_back")){
            if(deque.isEmpty()){
                sb.append(-1+"\n");
            }else{
                sb.append(deque.pollLast()+"\n");
            }
        }else if(command.equals("size")){
            sb.append(deque.size()+"\n");
        }else if(command.equals("empty")){
            if(deque.isEmpty()){
                sb.append(1+"\n");
            }else{
                sb.append(0+"\n");
            }
        }else if(command.equals("front")){
            if(deque.isEmpty()){
                sb.append(-1 + "\n");
            }else{
                sb.append(deque.peekFirst()+"\n");
            }
        }else if(command.equals("back")){
            if(deque.isEmpty()){
                sb.append(-1 + "\n");
            }else{
                sb.append(deque.peekLast()+"\n");
            }
        }


    }

}
