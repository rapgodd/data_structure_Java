package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Test20551 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split(" ");
        int arrayLength = Integer.parseInt(arr[0]);
        int questionAmount = Integer.parseInt(arr[1]);

        int[] providedArray = new int[arrayLength];

        int[] questionArray = new int[questionAmount];


        for(int i = 0; i<arrayLength; i++){

            providedArray[i] = Integer.parseInt(br.readLine());

        }
        Arrays.sort(providedArray);

        for(int i = 0; i<questionAmount; i++){

            questionArray[i] = Integer.parseInt(br.readLine());

        }

        binarySearch(providedArray, questionArray, sb,arrayLength);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static void binarySearch(int[] providedArray, int[] questionArray, StringBuilder sb, int provArrLen) {

        for(int i = 0; i<questionArray.length; i++){

            int NumWeNeedToFindIndex = questionArray[i];
            int index = binarySearchWithQuestion(providedArray, provArrLen, NumWeNeedToFindIndex);
            sb.append(index+"\n");

        }


    }

    private static int binarySearchWithQuestion(int[] providedArray, int provArrLen, int NumWeNeedToFindIndex) {

        int right = provArrLen-1;
        int left = 0;

        while(right>=left){

            int mid = (right + left) / 2;

            if(providedArray[mid]>=NumWeNeedToFindIndex){
                right = mid-1;
            }else if(providedArray[mid]<NumWeNeedToFindIndex){
                left = mid + 1;
            }

        }

        if(left < provArrLen && providedArray[left] == NumWeNeedToFindIndex) {
            return left;
        } else{
            return -1;
        }

    }



}
