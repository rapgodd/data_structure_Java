package com.giyeon.data_structure.collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();

        stringList.add("a");
        stringList.add("b");
        stringList.add("c");

        String s = stringList.get(0);
        System.out.println("s = " + s);
    }


}
