package com.giyeon.data_structure.backjoon;

import java.util.Arrays;
import java.util.Comparator;


/**
 * 배열의 정렬 방법
 */
public class ComparatorExample {

    public static void main(String[] args) {

        Comparator<int[]> com = (a, b) -> {
            if (a[0] > b[0]) {
                return 1;
            } else if (a[0] == b[0]) {
                return -1;
            } else {
                return -1;
            }
        };

        int[] arr1 = new int[]{1, 2};
        int[] arr2 = new int[]{2, 2};
        int[] arr3 = new int[]{3, 2};

        int[][] arrCollection = new int[][]{arr3,arr1,arr2};

        Arrays.sort(arrCollection,com);

        System.out.println(Arrays.deepToString(arrCollection));

    }

}
