package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q2346 {

    public static void main(String[] args) throws IOException{

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int capacity  = Integer.parseInt(br.readLine());
        ArrayDeque<Node> queue = new ArrayDeque<>(capacity);

        String[] arr = br.readLine().split(" ");
        for(int i =1; i<=arr.length; i++){
            int val = Integer.parseInt(arr[i-1]);
            Node node = new Node(val,i);
            queue.offerLast(node);
        }

        int count = 0;

        Node firstNode = queue.pollFirst();
        count = firstNode.value;
        sb.append(firstNode.index+" ");

        while(queue.size()!=0){
            if(count<0){

                count = count*-1;
                for(int i=1;i<count;i++){
                    queue.offerFirst(queue.pollLast());
                }
                Node targetNode = queue.pollLast();
                sb.append(targetNode.index+" ");
                count = targetNode.value;

            }else{

                for(int i=1;i<count;i++){
                    queue.offerLast(queue.pollFirst());
                }
                Node targetNode = queue.pollFirst();
                sb.append(targetNode.index+" ");
                count = targetNode.value;

            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }


    public static class Node{

        int index;
        int value;

        public  Node(int value, int index){
            this.value = value;
            this.index = index;
        }

    }

}
