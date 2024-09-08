package com.giyeon.data_structure.collection.set;
import java.util.Arrays;


public class HashStart2 {

    public static void main(String[] args){

        Integer[] arrays = new Integer[10];

        /**
         * 인덱스 번호와 데이터 값을 일치시킨다.
         */
        arrays[1] = 1;
        arrays[2] = 2;
        arrays[5] = 5;
        arrays[8] = 8;

        int searchValue = 8;

        System.out.println(Arrays.toString(arrays));
        System.out.println(arrays[searchValue]);


    }

}
