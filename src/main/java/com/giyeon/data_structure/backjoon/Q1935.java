package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q1935 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        String calculation = br.readLine();

        HashMap<String,Double> hashMap = new HashMap<>();
        ArrayDeque<Double> stack = new ArrayDeque<>(loop);

        int flag = 0;

        /**
         * 해쉬맵 채우기 [key : 문자열,
         *            value : 숫자 값]
         */
        for(int i = 0; i<calculation.length(); i++){

            String component = String.valueOf(calculation.charAt(i));

            if(!component.toLowerCase().equals(component)){

                if(hashMap.containsKey(component)){
                    continue;
                }

                hashMap.put(component,(double)Integer.parseInt(br.readLine()));
                flag++;
                if(flag>=loop){
                    break;
                }
            }

        }


        for(int i = 0; i<calculation.length(); i++) {

            String component = String.valueOf(calculation.charAt(i));

            if(!component.toLowerCase().equals(component)){
                stack.offerFirst(hashMap.get(component));
            }else{
                switch (component){

                    case "*":
                        double a = stack.pollFirst();
                        double b = stack.pollFirst();
                        double multi = a*b;
                        stack.offerFirst(multi);
                        break;
                    case "+":
                        double c = stack.pollFirst();
                        double d = stack.pollFirst();
                        double plus = c+d;
                        stack.offerFirst(plus);
                        break;
                    case "-":
                        double e = stack.pollFirst();
                        double f = stack.pollFirst();
                        double minus = f-e;
                        stack.offerFirst(minus);
                        break;
                    case "/":
                        double g = stack.pollFirst();
                        double l = stack.pollFirst();
                        double div = l/g;
                        stack.offerFirst(div);
                        break;


                }

            }

        }

        String answer = String.format("%.2f", stack.pollFirst());
        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();

    }

}