package com.giyeon.data_structure.collection.array;

public class MyArrayListV3BadMain {

    public static void main(String[] args) {

        MyArrayListV1 numList = new MyArrayListV1();

        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add("문자 4");

        Integer num1 = (Integer) numList.get(0);
    }

}
