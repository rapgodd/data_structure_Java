package com.giyeon.data_structure.collection.array;

public class MyArrayListMain {

    public static void main(String[] args) {

        MyArrayListV1 list = new MyArrayListV1();

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);


        System.out.println("addLast");
        list.add(3, "addList");
        System.out.println(list);

    }
}
