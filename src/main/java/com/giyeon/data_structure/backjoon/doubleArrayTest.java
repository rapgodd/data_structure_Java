package com.giyeon.data_structure.backjoon;

import java.util.Arrays;

public class doubleArrayTest {

    public static void main(String[] args) {

        boolean[][] booleanArr = new boolean[5][3];

        System.out.println(Arrays.deepToString(booleanArr));
        boolean[] a = booleanArr[0];
        System.out.println(Arrays.toString(a));
    }

}
