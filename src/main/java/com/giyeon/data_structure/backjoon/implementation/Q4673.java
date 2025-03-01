package com.giyeon.data_structure.backjoon.implementation;

import java.io.*;


public class Q4673 {

    public static void main(String[] args) throws IOException{

        boolean[] selfNumArr = new boolean[10001];
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i =1; i<=10000; i++){

            //b(n)적용
            int result = bn(i);

            //맵에 적용
            reflectArr(selfNumArr,result);

        }

        append(sb, selfNumArr);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void append(StringBuilder sb, boolean[] selfNumArr){
        for(int i=1; i<=10000; i++){
            if(selfNumArr[i]==false){
                sb.append(i);
                sb.append("\n");
            }
        }

    }

    private static int bn(Integer origin){

        int eachAddedNum=0;
        int construct = origin;


        while (construct > 0) {
            int rest = construct % 10;
            eachAddedNum += rest;
            construct = construct/10;
        }

        if(eachAddedNum + origin>10000){
            return 0;
        }else{
            return eachAddedNum + origin;

        }
    }

    private static void reflectArr(boolean[] selfNumArr, int result){
        if(result!=0){
            selfNumArr[result] = true;
        }
    }




}
