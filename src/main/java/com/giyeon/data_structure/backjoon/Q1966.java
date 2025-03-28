package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Q1966 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String[] a = br.readLine().split(" ");
            int docSize = Integer.parseInt(a[0]);
            int targetIndex = Integer.parseInt(a[1]);

            ArrayDeque<PrintNode> deque = new ArrayDeque<>(docSize);
            ArrayList<Integer> arr = new ArrayList<>();
            String[] docs = br.readLine().split(" ");

            int count = 0;
            for(int j = 0; j<docSize; j++){

                int val = Integer.parseInt(docs[j]);

                if(targetIndex==count){
                    PrintNode node = new PrintNode(val,true);
                    deque.offerLast(node);
                    count++;
                }else{
                    PrintNode node = new PrintNode(val,false);
                    deque.offerLast(node);
                    count++;
                }

                arr.add(val);
            }

            Collections.sort(arr, Collections.reverseOrder());
            int cursor=0;
            int printCounter = 0;
            while(!deque.isEmpty()){
                PrintNode doc = deque.pollFirst();

                if(arr.get(cursor)>doc.priority){
                    deque.offerLast(doc);
                }else{
                    if(doc.isTarget){
                        printCounter++;
                        sb.append(printCounter+"\n");
                        break;
                    }else{
                        printCounter++;
                        cursor++;
                    }
                }
            }


        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    public static class PrintNode{

        int priority;
        boolean isTarget;

        public PrintNode(int priority, boolean isTarget){
            this.priority = priority;
            this.isTarget = isTarget;
        }

    }

}
