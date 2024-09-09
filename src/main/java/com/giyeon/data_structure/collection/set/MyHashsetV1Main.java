package com.giyeon.data_structure.collection.set;

public class MyHashsetV1Main {

    public static void main(String[] args) {

        MyHashSetV1 set = new MyHashSetV1();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        System.out.println(set);

        int searchValue = 0;
        boolean result = set.contains(searchValue);
        System.out.println(result);

    }
}
