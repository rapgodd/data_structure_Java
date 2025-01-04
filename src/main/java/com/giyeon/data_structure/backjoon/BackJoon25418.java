package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class BackJoon25418 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] initNumAndGoalNum = br.readLine().split(" ");
        int init = Integer.parseInt(initNumAndGoalNum[0]);
        int goal = Integer.parseInt(initNumAndGoalNum[1]);

        Deque<int[]> nextNodes = new ArrayDeque<>();
        boolean[] ifVisited = new boolean[goal+1];
        nextNodes.offerLast(new int[]{init,0});
        ifVisited[init] = true;

        int minPath = getMinPathToGoal(nextNodes, goal,ifVisited);

        bw.write(String.valueOf(minPath));
        bw.flush();
        bw.close();
        br.close();

    }

    private static int getMinPathToGoal(Deque<int[]> nextNodes,int goal,boolean[] ifVisited){

        while(!nextNodes.isEmpty()){
            int[] nextNode = nextNodes.pollFirst();
            int currentValue = nextNode[0];
            int count = nextNode[1];

            if(currentValue==goal) {
                return count;
            }else{
                if(currentValue+1<=goal&&!ifVisited[currentValue+1]){
                    nextNodes.offerLast(new int[]{currentValue+1,count+1});
                    ifVisited[currentValue + 1] = true;
                }

                if(currentValue*2<=goal&&!ifVisited[currentValue*2]){
                    nextNodes.offerLast(new int[]{currentValue*2,count+1});
                    ifVisited[currentValue*2] = true;
                }
            }
        }
        return 0;
    }

}
