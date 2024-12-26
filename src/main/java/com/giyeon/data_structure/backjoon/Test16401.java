package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Test16401 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] MN = br.readLine().split(" ");

        int nephewAmount = Integer.parseInt(MN[0]);
        int cookieAmount = Integer.parseInt(MN[1]);

        String[] eachCookieString = br.readLine().split(" ");
        int cookieLenArrSize = eachCookieString.length;
        int[] cookieLenArray = new int[cookieLenArrSize];

        for(int i = 0; i<cookieLenArrSize; i++){
            int cookieLen = Integer.parseInt(eachCookieString[i]);
            cookieLenArray[i] = cookieLen;
        }

        int longestCookieLen = getLongestCookieLength(nephewAmount,cookieAmount,cookieLenArray);
        bw.write(String.valueOf(longestCookieLen));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int getLongestCookieLength(int nephewAmount, int cookieAmount, int[] cookieLenArray){

        Arrays.sort(cookieLenArray);
        int longestCookie = cookieLenArray[cookieLenArray.length - 1];

        int left = 1;
        int right = longestCookie;

        while(left<=right){

            int mid = (left + right) / 2;
            int dividedCookieAmount = 0;

            //총 나눠진 쿠키의 개수 구하기!
            for(int eachCookieLen : cookieLenArray){
                dividedCookieAmount += (eachCookieLen / mid);
            }

            if(dividedCookieAmount>=nephewAmount){
                left = mid + 1;
            }else{
                right = mid - 1;
            }


        }

        return right;

    }


}
