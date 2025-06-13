package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q1260 {

    static int startingPoint;
    static int nodeCount;
    static int connectCount;
    static boolean[] dfsVisited;
    static boolean[] bfsVisited;
    static HashMap<Integer, List<Integer>> map;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        nodeCount = Integer.parseInt(st.nextToken());
        connectCount = Integer.parseInt(st.nextToken());
        startingPoint = Integer.parseInt(st.nextToken());
        dfsVisited = new boolean[nodeCount+1];
        bfsVisited = new boolean[nodeCount+1];
        map = new HashMap<>(nodeCount+1);
        for (int i = 1; i <= nodeCount; i++) {
            map.put(i, new ArrayList<>());
        }

        for(int i=0; i<connectCount; i++){

            StringTokenizer st1 = new StringTokenizer(br.readLine());

            int i1 = Integer.parseInt(st1.nextToken());
            int i2 = Integer.parseInt(st1.nextToken());
            map.get(i1).add(i2);
            map.get(i2).add(i1);



        }
        Set<Integer> integers = map.keySet();
        for(Integer key: integers){
            Collections.sort(map.get(key));
        }
        dfsVisited[startingPoint] = true;
        sb.append(startingPoint).append(" ");
        dfs(sb,startingPoint);

        sb.append("\n");

        bfsVisited[startingPoint] = true;
        sb.append(startingPoint).append(" ");
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offerFirst(startingPoint);
        bfs(sb, queue);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }


    private static void bfs(StringBuilder sb, ArrayDeque<Integer> queue){

        if(!queue.isEmpty()){
            Integer key = queue.pollLast();
            List<Integer> nodes = map.get(key);

            for (int i = 0; i < nodes.size(); i++) {

                if(!bfsVisited[nodes.get(i)]){
                    queue.offerFirst(nodes.get(i));
                    bfsVisited[nodes.get(i)] = true;
                    sb.append(nodes.get(i)).append(" ");

                }

            }
            bfs(sb,queue);
        }


    }


    private static void dfs(StringBuilder sb, int key){

        List<Integer> nodes = map.get(key);
        for (int i = 0; i < nodes.size(); i++) {

            int connectNode = nodes.get(i);
            if(!dfsVisited[connectNode]){
                sb.append(connectNode).append(" ");
                dfsVisited[connectNode] = true;
                dfs(sb, connectNode);
            }


        }

    }

}
