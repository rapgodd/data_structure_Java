package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.ArrayDeque;

public class Q7562V2 {

    public static void main(String[] args) throws IOException {

        int[] left = new int[]{-2,-2,-1,-1,1,1,2,2};
        int[] right = new int[]{-1,1,-2,2,-2,2,-1,1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int loop = Integer.parseInt(br.readLine());

        for(int i = 0; i<loop; i++){

            int s = Integer.parseInt(br.readLine());
            boolean[][] arr = new boolean[s][s];
            ArrayDeque<int[]> queue = new ArrayDeque<>();

            String[] curr = br.readLine().split(" ");
            int x = Integer.parseInt(curr[0]);
            int y = Integer.parseInt(curr[1]);

            String[] destination = br.readLine().split(" ");

            arr[x][y] = true;
            queue.offerFirst(new int[]{x,y,0});

            boolean flag = true;

            while(!queue.isEmpty()&&flag){
                int[] node = queue.pollLast();
                int curX = node[0];
                int curY = node[1];
                int count = node[2];

                for(int j=0; j<8; j++){
                    int newX = curX+left[j];
                    int newY = curY+right[j];
                    //나이트가 이동한 범위가 체스판 안 벙위 이고
                    if(newX>=0&&newX<s&&
                            newY>=0&&newY<s){

                        //다른 노드가 이미 해당 칸을 지나가지 않은 경우
                        if(!arr[curX+left[j]][curY+right[j]]){

                            //그 칸이 목적지라면 -> 루프 종료
                            if(Integer.parseInt(destination[0])==newX
                                    &&Integer.parseInt(destination[1])==newY){
                                sb.append(count+1).append("\n");
                                flag = false;
                                break;
                            }else{
                                //그 칸이 목적지가 아니라면 -> 노드 큐에 넣고 true로 바꾸기
                                queue.offerFirst(new int[]{newX,newY,count+1});
                                arr[newX][newY]=true;
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

    }


