package com.giyeon.data_structure.backjoon;

import java.io.*;

public class Test11687V2 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int zeroAmount = Integer.parseInt(br.readLine());

        int left = 1;
        int right = zeroAmount * 5;
        int mid = (left + right) / 2;

        while(left<=right){

            mid = (left + right) / 2;

            if (zero(mid) >= zeroAmount) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        if (zero(left) == zeroAmount) {
            bw.write(String.valueOf(left));
        } else {
            bw.write(String.valueOf(-1));
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private static int zero(int mid){

        int count = 0;

        for (int i = 5; i<=mid; i = i*5 ) {

            count += (mid/i);

        }

        return count;

    }


}
