package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q9012 {
//
//    public static void main(String[] args) throws IOException{
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder sb = new StringBuilder();
//
//
//        int count = Integer.parseInt(br.readLine());
//        for (int i = 0; i < count; i++) {
//            ArrayDeque<String> stack = new ArrayDeque<>();
//            String sentence = br.readLine();
//
//            for(int j=0;j<sentence.length();j++){
//                char a = sentence.charAt(j);
//
//                if (a == '(') {
//                    stack.offerFirst(String.valueOf(a));
//                }else{
//                    if(stack.isEmpty()){
//                        sb.append("NO" + "\n");
//                        break;
//                    }else{
//                        stack.pollFirst();
//                    }
//                }
//
//                if(j==sentence.length()-1){
//                    if(stack.isEmpty()){
//                        sb.append("YES"+"\n");
//                    }else{
//                        sb.append("NO"+"\n");
//                    }
//                }
//            }
//        }
//        bw.write(sb.toString());
//        bw.flush();
//        bw.close();
//        br.close();
//    }

    /**
     * V2
     * 스택을 도입하지 않고 카운터로 해결
     */
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        int counter;
        int loopNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < loopNum; i++) {
            String givenStr = br.readLine();
            counter = 0;
            boolean isBreak = false;

            for (int j = 0; j < givenStr.length(); j++) {
                char c = givenStr.charAt(j);

                if(c=='('){
                    counter++;
                }else{
                    if(counter==0){
                        sb.append("NO\n");
                        isBreak = true;
                        break;
                    }else{
                        counter--;
                    }
                }
            }

            if(!isBreak){
                if(counter==0){
                    sb.append("YES\n");
                }else{
                    sb.append("NO\n");
                }
            }

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }


}
