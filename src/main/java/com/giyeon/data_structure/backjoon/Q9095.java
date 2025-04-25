package com.giyeon.data_structure.backjoon;

import java.io.*;

public class Q9095 {

    static int N;
    static int COUNT;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int loop = Integer.parseInt(br.readLine());

        for(int i =0; i<loop; i++){

            N = Integer.parseInt(br.readLine());
            COUNT = 0;

            if(N==1){
                sb.append("1").append("\n");
            }else if(N==2){
                sb.append("2").append("\n");
            }else if(N==3){
                sb.append("4").append("\n");
            }else{
                f(1);
                f(2);
                f(3);
                sb.append(COUNT).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }


    public static void f(int preVal){

        for(int i =1; i<=3; i++){
            if(preVal+i<N){
                f(preVal + i);
            }else if(preVal+i==N){
                COUNT++;
                break;
            }else{
                break;
            }
        }

    }


}
