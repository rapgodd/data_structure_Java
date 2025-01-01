package com.giyeon.data_structure.backjoon;
import java.util.*;
import java.io.*;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        boolean[] primeOrNotArr = fillPrimeOrNotArr();

        List<List<Integer>> resultArr = new ArrayList<>();

        int numsLen = nums.length;
        for(int i = 0; i<numsLen-2; i++){
            for(int j = i+1; j<numsLen-1; j++){
                for(int k = j+1; k<numsLen; k++){
                    if(primeOrNotArr[nums[i]+nums[j]+nums[k]]){
                        List<Integer> eactResultArr = new ArrayList<>();
                        eactResultArr.add(nums[i]);
                        eactResultArr.add(nums[j]);
                        eactResultArr.add(nums[k]);
                        resultArr.add(eactResultArr);
                    }
                }
            }
        }

        for(List<Integer> eachResult : resultArr){
            int result = 0;

            for(int i =0; i<3; i++){
                result += eachResult.get(i);
            }
            System.out.println(eachResult.toString()+"를 이용해서 "+String.valueOf(result)+"을 만들 수 있습니다.\n");

        }

    }

    private static boolean[] fillPrimeOrNotArr(){

         boolean[] primeOrNotArr = new boolean[3000];

        for(boolean primeOrNot : primeOrNotArr){
            primeOrNot = true;
        }

        primeOrNotArr[0] = false;
        primeOrNotArr[1] = false;

        for(int i = 0; i<3000; i++){
            if(primeOrNotArr[i]){
                for(int j = i*i; j<3000; j+=i){
                    primeOrNotArr[j] = false;
                }
            }
        }
        return primeOrNotArr;
    }


}
