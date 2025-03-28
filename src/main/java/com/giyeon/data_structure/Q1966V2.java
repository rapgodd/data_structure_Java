package com.giyeon.data_structure;
import java.util.*;
import java.io.*;

public class Q1966V2 {


        public static void main(String[] args) throws IOException{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();

            int testCase = Integer.parseInt(br.readLine());

            for (int i = 0; i < testCase; i++) {
                String a = br.readLine();

                String[] tokens = a.split(" ");
                int docSize = Integer.parseInt(tokens[0]);
                int targetIndex = Integer.parseInt(tokens[1]);

                ArrayDeque<PrintNode> deque = new ArrayDeque<>(docSize);
                int[] freq = new int[10];

                String docs = br.readLine();

                int count = 0;
                for(int j = 0; j < docs.length(); j += 2){

                    int val = Integer.parseInt(String.valueOf(docs.charAt(j)));

                    if(targetIndex == count){
                        PrintNode node = new PrintNode(val, true);
                        deque.offerLast(node);
                    } else {
                        PrintNode node = new PrintNode(val, false);
                        deque.offerLast(node);
                    }
                    count++;

                    freq[val]++;
                    //Collections sort -> O(nlog(n)시간 복잡도
                }

                int currentMaxPriority = 9;

                int printCounter = 0;
                while(!deque.isEmpty()){
                    PrintNode doc = deque.pollFirst();

                    while(currentMaxPriority > 0 && freq[currentMaxPriority] == 0) {
                        currentMaxPriority--;
                    }

                    // 이제 currentMaxPriority가 '실제 남아있는 최고 우선순위'
                    if (doc.priority == currentMaxPriority) {
                        printCounter++;
                        freq[doc.priority]--;

                        if(doc.isTarget){
                            sb.append(printCounter).append("\n");
                            break;
                        }

                    } else {
                        deque.offerLast(doc);
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

