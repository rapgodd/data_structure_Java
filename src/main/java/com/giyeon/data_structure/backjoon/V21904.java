package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class V21904 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] a = new int[1000001];
        a[1] = 1;
        a[2] = 2;

        for(int i = 3; i<a.length; i++){
            a[i] = (a[i - 1] + a[i - 2]) % 15746;
        }

        int n = Integer.parseInt(br.readLine());
        int result = a[n];

        sb.append(result);
        String stringResult = sb.toString();
        bw.write(stringResult);
        bw.flush();
        bw.close();
        br.close();


    }

}
