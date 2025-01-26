package com.giyeon.data_structure.impl;

import java.util.*;
import java.io.*;

public class T10973 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int i = Integer.parseInt(br.readLine());
        String givenArr = br.readLine();
        String[] splitGivenArr = givenArr.split(" ");
        int size = splitGivenArr.length;
        int[] intArr = new int[size];



        initFillSb(sb,i);

        if(!initCompare(sb, givenArr)){
            bw.write("-1");
            bw.flush();
            bw.close();
            br.close();
        }else{
            fillIntArr(intArr,size,splitGivenArr);
            changeIntArrToPrev(intArr, size);
            changePrevArrToStr(intArr,result);
            bw.write(result.toString());
            bw.flush();
            bw.close();
            br.close();
        }

    }

    private static void changePrevArrToStr(int[] intArr, StringBuilder sb){

        for(int a : intArr){
            sb.append(a+" ");
        }

    }

    private static void changeIntArrToPrev(int[] intArr, int size) {

        int i = 0;

        for (int j = size - 1; j >= 1; j--) {

             if(intArr[j]<intArr[j-1]){

                 i = j - 1;
                 break;
             }
        }

        for (int j = size - 1; j >= 1; j--) {

            if(intArr[i]>intArr[j]){

                int a = intArr[i];
                int b = intArr[j];

                intArr[i] = b;
                intArr[j] = a;
                break;
            }

        }

        des(intArr, i+1);
    }

    private static void des(int[] a, int c) {

        int start = c;
        int end = a.length - 1;

        while (start < end) {

            int v = a[start];
            int b = a[end];

            a[start] = b;
            a[end] = v;

            start += 1;
            end -= 1;
        }

    }

    private static void fillIntArr(int[] intArr, int size, String[] splitGivenArr) {

        for(int i = 0; i<size; i++){
            intArr[i] = Integer.parseInt(splitGivenArr[i]);
        }

    }


    private static boolean initCompare(StringBuilder sb, String givenArr) {
        String init = sb.toString();

        if(init.equals(givenArr)){
            return false;
        }else{
            return true;
        }
    }

    private static void initFillSb(StringBuilder sb, int a) {

        for(int i = 1; i<=a; i++){
            if(i!=a){
                sb.append(i+" ");
            }else{
                sb.append(i);
            }
        }

    }

}
