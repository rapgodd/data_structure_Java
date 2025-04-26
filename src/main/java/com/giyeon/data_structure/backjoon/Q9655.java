package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q9655 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        // N : 총 돌의 개수
        // 상근 먼저 시작
        // 둘다 완벽하게 게임을 한다고 가정했을 시 누가 이기느냐?

        int N = Integer.parseInt(br.readLine());
        int count = 1;

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // 첫번째
        if(3+3<N){
            queue.offerFirst(1);
            queue.offerFirst(3);
        }else if(1+3<N){
            queue.offerFirst(1);
        }

        while (!queue.isEmpty()) {

            count++;

            int size = queue.size();
            for(int i = 0; i<size; i++){
                int component = queue.pollLast();
                int plusOne = component + 1;
                int plusThree = component + 3;

                if(plusOne<N-3 && plusThree<N-3){
                    queue.offerFirst(plusOne);
                    queue.offerFirst(plusThree);
                }else if(plusOne<N-3){
                    queue.offerFirst(plusThree);
                }

            }


        }

        if(count%2==0){
            bw.write("SK");
        }else{
            bw.write("CY");
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
