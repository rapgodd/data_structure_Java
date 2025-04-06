package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q11286 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Comparator<QueueNode> QueueNodeComp = (a, b) -> {
            if(a.value>b.value){
                return 1;
            }else if(a.value==b.value){
                if(a.isMinus&&!b.isMinus){
                    return -1;
                }else{
                    return 1;
                }
            }else{
                return -1;
            }
        };

        int count = Integer.parseInt(br.readLine());
        PriorityQueue<QueueNode> queue = new PriorityQueue<>(QueueNodeComp);

        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) {
                queue.offer(new QueueNode(num < 0 ? true : false, num < 0 ? num * -1 : num));
            }else{

                if(queue.isEmpty()){
                    sb.append(0+"\n");
                    continue;
                }

                QueueNode node = queue.poll();
                if(node.isMinus){
                    sb.append((node.value * -1)+"\n");
                }else{
                    sb.append(node.value+"\n");
                }

            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }


    public static class QueueNode{

        int value;
        boolean isMinus;

        public QueueNode(boolean isMinus, int value) {

            this.isMinus = isMinus;
            this.value = value;

        }

    }
}


