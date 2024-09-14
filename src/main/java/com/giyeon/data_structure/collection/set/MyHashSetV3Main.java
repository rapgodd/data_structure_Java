package com.giyeon.data_structure.collection.set;

public class MyHashSetV3Main {

    public static void main(String[] args){

        MySet<String> mySet = new MyHashSetV3<>(10);

        mySet.add("A");
        mySet.add("B");
        mySet.add("C");

        System.out.println("mySet = " + mySet);

        String searchValue = "A";
        boolean result = mySet.contains(searchValue);
        System.out.println("result = " + result);

    }

}
