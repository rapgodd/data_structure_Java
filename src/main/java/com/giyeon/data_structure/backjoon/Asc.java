package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.Arrays;

public class Asc {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int initialNum = Integer.parseInt(br.readLine());
        Integer[] numArr = new Integer[initialNum];

        for (int i = 0; i < initialNum; i++) {
            int givenNum = Integer.parseInt(br.readLine());
            numArr[i] = givenNum;
        }

        Arrays.sort(numArr);
        for (Integer integer : numArr) {
            bw.write(integer.toString() + "\n");
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
