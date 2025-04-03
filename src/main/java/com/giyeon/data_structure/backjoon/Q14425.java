package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q14425 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");
        int N = Integer.parseInt(a[0]);
        int M = Integer.parseInt(a[1]);

        Set<String> set = new HashSet<>(N);

        //집합에 집어넣기
        for(int i=0; i<N; i++){

            set.add(br.readLine());

        }

        //검사하기
        int count = 0;
        for(int i=0; i<M; i++){

            if(set.contains(br.readLine())){
                count++;
            }

        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }

}
