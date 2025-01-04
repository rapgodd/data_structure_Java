package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class BFS {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // 첫 줄 입력: N, M, R
        String[] a = br.readLine().split(" ");
        int nodeAmount = Integer.parseInt(a[0]);
        int connectedLineAmount = Integer.parseInt(a[1]);
        int startNode = Integer.parseInt(a[2]);

        // 인접 리스트 초기화 (양방향)
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i =0;i<=nodeAmount;i++){
            graph.add(new ArrayList<Integer>());
        }

        // 간선 정보 입력 및 양방향 추가
        for(int i = 0; i < connectedLineAmount; i++){
            String[] split = br.readLine().split(" ");
            int u = Integer.parseInt(split[0]);
            int v = Integer.parseInt(split[1]);

            graph.get(u).add(v);
            graph.get(v).add(u); // 양방향 추가
        }

        // 모든 인접 리스트 오름차순 정렬
        for(int i = 1; i <= nodeAmount; i++){
            Collections.sort(graph.get(i));
        }

        // 방문 순서를 기록할 배열 초기화
        int[] order = new int[nodeAmount + 1];
        Arrays.fill(order, 0);

        // BFS 수행
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(startNode);
        order[startNode] = 1; // 시작 정점 방문 순서 1
        int count = 2;

        while(!queue.isEmpty()){
            int current = queue.pollFirst();
            for(int neighbor : graph.get(current)){
                if(order[neighbor] == 0){
                    order[neighbor] = count++;
                    queue.offerLast(neighbor);
                }
            }
        }

        // 방문 순서 배열을 정점 번호 순서대로 출력
        for(int i = 1; i <= nodeAmount; i++){
            sb.append(order[i]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}