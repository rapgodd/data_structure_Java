package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Q1766 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pqExceptContentsFromHash = new PriorityQueue<>();
        PriorityQueue<Integer> values = new PriorityQueue<>();


        String[] loopNum = br.readLine().split(" ");
        int questionSize = Integer.parseInt(loopNum[0]);
        int prioritySize = Integer.parseInt(loopNum[1]);

        fillPriorityQueue(pq,questionSize,pqExceptContentsFromHash);

        HashMap<Integer,Integer> secondAndFirstHashMap = new HashMap<>();

        getFillHashMap(secondAndFirstHashMap, prioritySize, br, pqExceptContentsFromHash);
        Collection<Integer> valuesCollection = secondAndFirstHashMap.values();
        for (Integer value : valuesCollection) {
            values.offer(value);
        }

        findResultSequence(sb,pq,pqExceptContentsFromHash,values,secondAndFirstHashMap);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static void findResultSequence(StringBuilder sb, PriorityQueue<Integer> pq,PriorityQueue<Integer> values, PriorityQueue<Integer> pqExceptHash, HashMap<Integer,Integer> hash){

        while(pq.size()>0){
            Integer poll = pq.poll();//1 2 3 4 에서 1
            //pqExceptHash null
            //values 3 4

            if(hash.containsKey(poll)){
                if(hash.get(poll).equals(values.peek())){
                    if(pqExceptHash.peek().equals(poll) || pqExceptHash.peek()==null){
                        sb.append(poll+" ");
                        values.poll();
                        pqExceptHash.poll();
                    }else{
                        pq.offer(poll);
                    }
                }else{
                    findResultSequence(sb,pq,pqExceptHash,values,hash);
                    pq.offer(poll);
                }

            }else{
                if(pqExceptHash.poll().equals(poll)) {
                    sb.append(poll + " ");
                }
            }
        }

    }


    private static void getFillHashMap(HashMap<Integer, Integer> secondAndFirstHashMap, int prioritySize, BufferedReader br, PriorityQueue<Integer> pq) throws IOException{

        for(int i =0; i<prioritySize; i++){

            String[] split = br.readLine().split(" ");
            int second = Integer.parseInt(split[1]);
            int first = Integer.parseInt(split[0]);
            secondAndFirstHashMap.put(second,first);

            pq.remove(second);
            pq.remove(first);

        }

    }

    private static void fillPriorityQueue(PriorityQueue<Integer> pq, int questionSize, PriorityQueue<Integer> pq1){

        for(int i = 1; i <= questionSize; i++){
            pq.offer(i);
            pq1.offer(i);
        }

    }

}
