package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Q7562 {

    public static void main(String[] args) throws IOException{

        int[] left = new int[]{-2,-2,-1,-1,1,1,2,2};
        int[] right = new int[]{-1,1,-2,2,-2,2,-1,1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int loop = Integer.parseInt(br.readLine());

        for(int i = 0; i<loop; i++){

            int s = Integer.parseInt(br.readLine());
            boolean[][] arr = new boolean[s][s];
            ArrayDeque<Node> queue = new ArrayDeque<>();

            String[] curr = br.readLine().split(" ");
            int x = Integer.parseInt(curr[0]);
            int y = Integer.parseInt(curr[1]);

            String[] destination = br.readLine().split(" ");

            arr[x][y] = true;
            queue.offerFirst(new Node(new int[]{x, y}, 0));

            boolean flag = true;

            while(!queue.isEmpty()&&flag){
               Node node = queue.pollLast();
               int[] pos = node.position;

               for(int j=0; j<8; j++){

                   //나이트가 이동한 범위가 체스판 안 벙위 이고
                   if(pos[0]+left[j]>=0&&pos[0]+left[j]<s&&
                   pos[1]+right[j]>=0&&pos[1]+right[j]<s){

                        //다른 노드가 이미 해당 칸을 지나가지 않은 경우
                        if(!arr[pos[0]+left[j]][pos[1]+right[j]]){

                            //그 칸이 목적지라면 -> 루프 종료
                            if(Integer.parseInt(destination[0])==pos[0]+left[j]
                            &&Integer.parseInt(destination[1])==pos[1]+right[j]){
                                sb.append(node.count+1).append("\n");
                                flag = false;
                                break;
                            }else{
                                //그 칸이 목적지가 아니라면 -> 노드 큐에 넣고 true로 바꾸기
                                queue.offerFirst(new Node(new int[]{pos[0] + left[j], pos[1] + right[j]}, node.count+1));
                                arr[pos[0] + left[j]][pos[1] + right[j]] = true;
                            }

                        }

                   }
               }

            }
            if(queue.isEmpty()&&flag){
                sb.append(0 + "\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    public static class Node{

        int[] position;
        int count;

        public Node(int[] pos, int count){
            this.position = pos;
            this.count = count;
        }
    }

}
