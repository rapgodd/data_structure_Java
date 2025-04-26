package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.Arrays;

public class Test1654 {

    static int sum = 0;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String[] split = br.readLine().split(" ");
        int k = Integer.parseInt(split[0]);
        int n = Integer.parseInt(split[1]);

        int[] kArr = new int[k];

        fillKArr(kArr, br);
        Arrays.sort(kArr);
        long max = kArr[kArr.length - 1];

        long result = binarySearchMethod(max,kArr,n);
        sb.append(result);
        String a = sb.toString();
        bw.write(a);
        bw.flush();
        bw.close();
        br.close();

        int[] arr = new int[3];
        System.out.println(arr[1]);

    }

    private static long binarySearchMethod(long max, int[] kArr, int n){

        long left = 1;
        long right = max;
        long mid = 1+(right-left)/2;
        int length = kArr.length;


        while(left<=right){
            int count = 0;
            mid = (left + right) / 2;

            for (int i = 0; i<length; i++){

                long wireNum = kArr[i] / mid;
                count += wireNum;

            }

            if(count>=n){ //조건 만족시 a==b 이런 형식으로 적기 (이거 맞아?)
                left = mid+1;
            }else{
                right = mid - 1;
            }

        }
        return right;

    }


    private static void fillKArr(int[] kArr, BufferedReader br) throws IOException{

        for(int i = 0; i<kArr.length; i++){

            int k = Integer.parseInt(br.readLine());
            sum += k;
            kArr[i] = k;
        }

    }

}
