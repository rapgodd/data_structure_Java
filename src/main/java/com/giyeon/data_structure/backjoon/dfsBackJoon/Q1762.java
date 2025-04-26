package com.giyeon.data_structure.backjoon.dfsBackJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Q1762 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq= new PriorityQueue<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        String[] loopNum = br.readLine().split(" ");
        int questionSize = Integer.parseInt(loopNum[0]);
        int prioritySize = Integer.parseInt(loopNum[1]);

        fillList(list,questionSize,arrayList);
        fillListWithPriority(br,list,arrayList,prioritySize);
        fillpq(pq, arrayList);
        getSequencePq(pq,list,arrayList,sb);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static void getSequencePq(PriorityQueue<Integer> pq, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> arr,StringBuilder sb) {
        while(!pq.isEmpty()){
            Integer poll = pq.poll();
            sb.append(poll).append(" ");

            for(Integer element : list.get(poll)){
                arr.set(element, arr.get(element)-1);
                if(arr.get(element) == 0){
                    pq.offer(element);
                }
            }
        }
    }

    private static void fillpq(PriorityQueue<Integer> pq, ArrayList<Integer> list) {

        for(int i =1; i<list.size(); i++){
            if(list.get(i).equals(0)){
                pq.offer(i);
            }
        }

    }

    private static void fillListWithPriority(BufferedReader br, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> arrList, int size) throws IOException {

        for (int i =0; i<size; i++) {
            String[] st = br.readLine().split(" ");
            int priority = Integer.parseInt(st[0]);
            int afterPr = Integer.parseInt(st[1]);
            list.get(priority).add(afterPr);
            arrList.set(afterPr,arrList.get(afterPr)+1);
        }

    }

    private static void fillList(ArrayList<ArrayList<Integer>> list, int questionSize,ArrayList<Integer> arrList){

        for(int i = 0; i < questionSize+1; i++){
            ArrayList<Integer> arr = new ArrayList<>();

            list.add(arr);
            arrList.add(0);
        }

    }

}
