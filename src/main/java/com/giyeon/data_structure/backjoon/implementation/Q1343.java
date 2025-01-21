package com.giyeon.data_structure.backjoon.implementation;

import java.io.*;
import java.util.*;

public class Q1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < input.length()) {
            char c = input.charAt(i);

            // (1) '.'이면 그대로 붙이고 넘어간다
            if (c == '.') {
                result.append('.');
                i++;
            } else {
                // (2) 'X'면 연속 길이 확인
                int count = 0;
                int start = i;

                // start부터 연속해서 X인 구간
                while (i < input.length() && input.charAt(i) == 'X') {
                    count++;
                    i++;
                }
                int quotient = count / 4;
                for (int q = 0; q < quotient; q++) {
                    result.append("AAAA");
                }

                int remainder = count % 4;
                if (remainder == 2) {
                    result.append("BB");
                } else if (remainder == 1 || remainder == 3) {
                    // 덮을 수 없음
                    System.out.println(-1);
                    return;
                }
            }
        }

        // 모든 구간을 문제없이 덮은 경우
        System.out.println(result);
    }
}