package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Test112 {

    public static void main(String[] args) throws IOException{
        /**
         *  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         *
         *         String a = br.readLine();
         *         if(a.equals("")){
         *             a = null;
         *         }
         *
         *         //1) 첫번째 해결 방법 if문
         *         if(a==null){
         *             a = "There is NO VALUE";
         *             System.out.println(a);
         *             return;
         *         }
         *
         *         System.out.println(a);
         */

        //Optional을 이용한 Null처리방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        if(a.equals("")){
            a = null;
        }
        Optional<String> b = Optional.ofNullable(a);

//        b.ifPresent(string->{
//                        if(string.contains("hh")){
//                            StringBuilder sb = new StringBuilder();
//                            sb.append(string);
//                            System.out.println("daowida");
//                        }
//        });

        String c = b.orElseThrow();

        System.out.println(c);

    }



}
