package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q10866 {

    /**
     * 백준 10866번
     */
    public static void main(String[] main) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<String> deque = new ArrayDeque<>();

        int loopCount = Integer.parseInt(br.readLine());

        /**
         * 입력된 명령어에 따른 로직을 수행
         */
        for(int i = 0; i<loopCount; i++){

            String command = br.readLine();
            if(command.startsWith("pu")){
                if(command.startsWith("push_back")){
                    deque.offerLast(command.substring(10));
                }else if(command.startsWith("push_front")){
                    deque.offerFirst(command.substring(11));
                }
            }else{
                if(command.equals("front")){
                    if(!deque.isEmpty()){
                        sb.append(deque.peekFirst()+"\n");
                    }else{
                        sb.append(-1+"\n");
                    }
                }else if(command.equals("back")){
                    if(!deque.isEmpty()){
                        sb.append(deque.peekLast()+"\n");
                    }else{
                        sb.append(-1+"\n");
                    }
                }else if(command.equals("size")){
                    sb.append(deque.size()+"\n");
                }else if(command.equals("empty")){
                    if(deque.isEmpty()){
                        sb.append(1+"\n");
                    }else{
                        sb.append(0+"\n");
                    }
                }else if(command.equals("pop_front")){
                    if(deque.isEmpty()){
                        sb.append(-1+"\n");
                    }else{
                        sb.append(deque.pollFirst()+"\n");
                    }
                }else{
                    if(deque.isEmpty()){
                        sb.append(-1+"\n");
                    }else{
                        sb.append(deque.pollLast()+"\n");
                    }
                }
            }




        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
