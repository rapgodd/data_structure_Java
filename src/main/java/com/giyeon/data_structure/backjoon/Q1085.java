package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q1085 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[] arr = new int[4];

        // (0,--)이 되기 위해 X를 얼마만큼 움직여야 하는가
        arr[0] = X;

        // (--,0)이 되기 위해 Y를 얼마만큼 움직여야 하는가
        arr[1] = Y;
        arr[2] = W-X;
        arr[3] = H-Y;

        Arrays.sort(arr);

        bw.write(String.valueOf(arr[0]));
        bw.flush();
        bw.close();
        br.close();

    }

}
