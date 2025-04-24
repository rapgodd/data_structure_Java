package com.giyeon.data_structure.backjoon.dfsBackJoon;

import java.io.*;

public class Q24416 {

    static int fibCount = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int index = Integer.parseInt(br.readLine());

        fib(index);

        bw.write(sb.append(fibCount).append(" ").append(index-2).toString());
        bw.flush();
        bw.close();
        br.close();

    }

    public static int fib(int index){

        if(index == 1 || index == 2){
            fibCount++;
            return 1;
        }else{
            return fib(index - 1) + fib(index - 2);
        }

    }


}
