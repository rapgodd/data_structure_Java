package com.giyeon.data_structure.backjoon.implementation;

import java.util.*;
import java.io.*;

public class binaryNumber {

    public static ArrayList<Integer> binaryNList;
    public static boolean zero = false;
    public static int oneSize = 0;
    public static ArrayList<Integer> resultStorage = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        binaryNList= changeToBinary(n);

        if(oneSize==1||zero==false){
            //0이 없거나 다 1이면 그냥 뒤에 0하나 붙인 값을 리턴
            binaryNList.add(0);
            System.out.println(binaryToNum(binaryNList));
        }else{
            binaryNList = new ArrayList<>(32);

            //초기 리스트 설정
            for(int i = 0; i<32; i++){
                if(i==0){
                    binaryNList.add(1);
                }else{
                    binaryNList.add(0);
                }
            }

            //시작지점, 현재 1의 개수, 리스트
            backTrack(1,1,binaryNList);
            Collections.sort(resultStorage);
            System.out.println(resultStorage.get(0));

        }

    }

    public static void backTrack(int start, int currentOne, ArrayList<Integer> binaryList){

        if(currentOne==oneSize){
            resultStorage.add(binaryToNum(binaryList));
            return;
        }else if(start==binaryList.size()-1){
            return;
        }else{
            for(int i =0 ; i<=1;i++){
                if(i==1){
                    binaryList.set(start,i);
                    backTrack(start+1,currentOne+1,binaryList);
                    binaryList.set(start,0);
                }else{
                    binaryList.set(start,i);
                    backTrack(start+1,currentOne,binaryList);

                }
            }
        }


    }


    public static ArrayList<Integer> changeToBinary(int n){

        boolean t = true;
        ArrayList<Integer> returnValue = new ArrayList<>();
        int remain=0;
        int target=n;
        for(int i =0 ; i<32; i++){

            if(target==0){
                break;
            }

            remain = target%2;
            if(remain == 1){
                oneSize +=1;
            } else if (remain == 0) {
                zero = true;
            }
            returnValue.add(remain);
            target = target/2;

        }
        return returnValue;


    }

    public static int binaryToNum(ArrayList<Integer> binaryNList){

        int size = binaryNList.size();
        int resultNum = 0;

        for(int i =0; i<size; i++){
            int a = binaryNList.get(i);

            if(a==1){
                resultNum += (int) Math.pow(2,i+1);
            }

        }
        return resultNum;

    }
}
