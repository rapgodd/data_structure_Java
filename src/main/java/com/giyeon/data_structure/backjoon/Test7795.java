package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Test7795 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int loopNum = Integer.parseInt(br.readLine());

        for(int i = 0; i<loopNum; i++){
            binaryLoop(br,sb);
        }

        String result = sb.toString();
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }

    /**
     * b보다 큰 A의 수를 찾기위해 이진탐색을 사용할 것이다.
     * 각각의 집합 크기만큼 루프를돌며 원소 받아서 A B 배열을 만들고
     * A를 정렬하고 B를 하나씩 A에 이진탐색을 하면서 값을 구한다.
     */
    private static void binaryLoop(BufferedReader br, StringBuilder sb) throws IOException {

        String[] split = br.readLine().split(" ");
        int aN = Integer.parseInt(split[0]);
        int bN = Integer.parseInt(split[1]);

        int[] a = new int[aN];
        int[] b = new int[bN];

        String[] aArr = br.readLine().split(" ");
        String[] bArr = br.readLine().split(" ");

        for (int i = 0; i < aN; i++) {
            a[i] = Integer.parseInt(aArr[i]);
        }

        for (int j = 0; j < bN; j++) {
            b[j] = Integer.parseInt(bArr[j]);
        }

        Arrays.sort(a);

        int count = 0;

        for (int j = 0; j < bN; j++) {
            int bValue = b[j];

            int left = 0;
            int right = a.length; // 배열의 길이로 설정

            while (left < right) { // left가 right보다 작을 동안 반복
                int mid = (left + right) / 2;

                if (a[mid] > bValue) {
                    right = mid; // key 이상인 첫 위치를 찾기 위해 오른쪽 범위 축소
                } else {
                    left = mid + 1; // key보다 큰 값을 찾기 위해 왼쪽 범위 축소
                }
            }

            count += (a.length - left);
        }

        sb.append(count + "\n");

    }
}
