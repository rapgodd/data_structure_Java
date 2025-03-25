package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Q2164 {

    /**
     * 백준 2164번 풀이
     */
    public static void main(String[] main) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> queue = new ArrayDeque<>(count);

        /**
         * 큐에 원소를 집어넣습니다.
         *
         * 시간복잡도 o(n)
         */
        for(int i =1; i<=count; i++){
            queue.offerLast(i);
        }

        /**
         * queue의 사이즈가 1이 되기 전까지
         * 문제의 조건을 따라 원소를 제거하고 재배치하는
         * 작업을 진행합니다
         *
         * 시간복잡도 o(n)
         */
         while(queue.size()!=1){
             queue.pollFirst();
             int component = queue.pollFirst();

             queue.offerLast(component);
         }

        /**
         * 마지막까지 queue에 담긴 값을
         * 꺼내 리턴합니다.
         */
        bw.write(String.valueOf(queue.pollFirst()));
        bw.flush();
        bw.close();
        br.close();


        /**
         * 문제는 2초안에 연산을 요구합니다.
         * 이는 2억번 이내의 연산을 의미합니다.
         *
         * 위의 알고리즘은 최대 200만번~300만번의 연산을 수행함으로
         * 문제의 조건을 만족합니다.
         *
         * -끝-
         */
    }

}
