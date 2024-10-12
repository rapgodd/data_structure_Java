package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class sortingX {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int AmountsOfNumbers = Integer.parseInt(br.readLine());


        Integer[] array = new Integer[AmountsOfNumbers];

        for(int i = 0; i<AmountsOfNumbers; i++){
            Integer eachNumber = Integer.parseInt(br.readLine());
            array[i] = eachNumber;
        }
        /**
         * 기본정렬은 오름차순정렬이다.
         * 내림차순 정렬 연슴
         */
        Arrays.sort(array, new DesComparator());

        for (Integer integer : array) {
            String s = String.valueOf(integer);
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    /**
     * 직접 만든 클래스에 정렬 기준을 넣고 싶으면 comparable
     * 하지만 그게 아니라
     * 너가 원래 있던 객체에 추가 정렬 기준을 제공하고 싶은거라면 Comparable을 상속하는 클래스를 만들어야 한다.
     */
    static class DesComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return (o1<o2)?1:((o1==o2)?0:-1);
        }
    }

}
