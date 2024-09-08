package com.giyeon.data_structure.collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(Arrays.toString(arr));

        //인덱스의 위치를 변경
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        //인덱스 조회
        System.out.println("arr[2] = " + arr[2]);

        //배열 검색
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] = " + arr[i]);
            if (arr[i] == value) {
                break;
            }
        }
    }

}
