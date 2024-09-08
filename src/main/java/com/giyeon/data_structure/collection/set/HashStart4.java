package com.giyeon.data_structure.collection.set;
import java.util.Arrays;


public class HashStart4 {

    static int Capacity = 10;

    public static void main(String[] args){

        Integer[] integers = new Integer[10];

        integers[1] = 1;
        integers[2] = 2;
        integers[5] = 5;
        integers[8] = 8;
        int hashIndex = hashIndex(99);
        integers[hashIndex] = 99;


    }

    /**
     * 10을 초과하는 값듷이 몇번째 인덱스에 저장되어있는지를
     * 확인할 수 있는 메서드
     */
    private static int hashIndex(int value){
        int hashIndexValue = 0;
        return hashIndexValue = value % Capacity;
    }

}
