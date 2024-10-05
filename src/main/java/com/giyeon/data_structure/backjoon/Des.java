package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 궁금점
 * 1,000,000,000 이면 1중 for문을 사용한다 하더라도 대략 10초가 걸리는것으로 알고 있었다.
 * 근데 여기서 for문을 사용을 해서 시간초과가 나올줄 알았는데
 * 시간초과가 나오지 않았다. 어떻게 된건가?
 */
public class Des {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String givenNumString = br.readLine();
        String[] split = givenNumString.split("");

        Arrays.sort(split , new DesComparator());

        for (String s : split) {
            bw.write(s);
        }
        bw.flush();

        br.close();
        bw.close();
    }

    static class DesComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            int num1 = Integer.parseInt(o1);
            int num2 = Integer.parseInt(o2);

            return (num1 < num2) ? 1 : (num1==num2 ? 0 : -1);
        }
    }
}
