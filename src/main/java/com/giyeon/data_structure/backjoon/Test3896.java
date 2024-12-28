package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Test3896 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int testAmount = Integer.parseInt(br.readLine());

        boolean[] arrayTill100000thPrimeNum = new boolean[1299710];
        int arrayTill100000thPrimeNumSize = 1299710;

        int[] primeArray = new int[100000];
        int primeArraySize = 100000;


        fillTheArrs(arrayTill100000thPrimeNum, arrayTill100000thPrimeNumSize, primeArray, primeArraySize);

        for (int i = 0; i < testAmount; i++) {

            int testNum = Integer.parseInt(br.readLine());

            if(arrayTill100000thPrimeNum[testNum]){
                sb.append(0+"\n");
            }else{
                int size = getTwoPrimeNumBetweenSize(testNum,primeArray);
                sb.append(size + "\n");
            }

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }

    private static int getTwoPrimeNumBetweenSize(int num,int[] primeArray) {

        //합성수의 이전 소수 구하기
        int beforePrime = getBeforePrime(num,primeArray);
        //합성수의 이후 소수 구하기
        int afterPrime = getAfterPrime(num,primeArray);

        return afterPrime - beforePrime;


    }

    private static int getAfterPrime(int num,int[] primeArray) {

        int left = 0;
        int right = 99999;

        while(left<=right){
            int mid = (left + right) / 2;

            if(primeArray[mid]>num){
                right = mid - 1;
            }else if(primeArray[mid]<num){
                left = mid + 1;
            }

        }

        return primeArray[left];
    }

    private static int getBeforePrime(int num,int[] primeArray) {

        int left = 0;
        int right = 99999;

        while(left<=right){
            int mid = (left + right) / 2;

            if(primeArray[mid]>num){
                right = mid - 1;
            }else if(primeArray[mid]<num){
                left = mid + 1;
            }

        }

        return primeArray[right];
    }


    private static void fillTheArrs(boolean[] arrayTill1299710Num, int arrayTill100000thPrimeNumSize, int[] onlyPrimeArray, int primeArraySize) {


        for(long i = 0; i<arrayTill100000thPrimeNumSize; i++){
            arrayTill1299710Num[(int)i] = true;
        }



        for(long i=2; i<arrayTill100000thPrimeNumSize; i++){
            if(arrayTill1299710Num[(int)i]==true){
                if(i*i<arrayTill100000thPrimeNumSize){
                    for(long j = i*i; j<arrayTill100000thPrimeNumSize; j+=i){
                        arrayTill1299710Num[(int)j] = false;
                    }
                }
            }
        }

        int count = 0;

        for(int i=2; i<arrayTill100000thPrimeNumSize; i++){
            if(arrayTill1299710Num[i]){

                onlyPrimeArray[count] = i;
                count++;
            }
        }

    }



}
