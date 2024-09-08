package com.giyeon.data_structure.collection.array;

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        //배열의 첫번째 위치에 추가. 3 추가
        addFirst(arr, 3);
        System.out.println(Arrays.toString(arr));

        int index = 2;
        int changeValue = 8;

        addAt(index, changeValue, arr);
        System.out.println(Arrays.toString(arr));

        int indexNum = 4;
        int value = 312;

        addLast(indexNum, value, arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void addLast(int indexNum, int value, int[] arr) {
        arr[indexNum] = value;
    }

    private static void addAt(int index, int changeValue, int[] arr) {

        for (int i = arr.length - 1; i > 2; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = changeValue;

    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = newValue;
    }


}
