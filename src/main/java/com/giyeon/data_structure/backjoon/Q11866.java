package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q11866 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // N(몇명), M(몇번째 제거)를 구한다
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 큐를 만들고 1 ~ N 까지 수를 집어 넣는다.
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for(int i=1; i<=N; i++){
            queue.offerFirst(i);
        }

        // queue가 빌때까지 루프를 돌리면서 sb를 채운다
        sb.append("<");
        while (!queue.isEmpty()) {

            for(int i=1; i<=M; i++){
                if(i==M){
                    if(queue.size()==1){
                        int node = queue.pollLast();
                        sb.append(node);
                    }else{
                        int node = queue.pollLast();
                        sb.append(node).append(", ");
                    }
                }else{
                    queue.offerFirst(queue.pollLast());
                }
            }

        }
        sb.append(">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();



    }

}
