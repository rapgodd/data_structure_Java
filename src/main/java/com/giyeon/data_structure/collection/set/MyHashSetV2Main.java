package com.giyeon.data_structure.collection.set;

public class MyHashSetV2Main {

    public static void main(String[] args){

        MyHashSetV2 myHashSetV2 = new MyHashSetV2(10);
        myHashSetV2.add("A");
        myHashSetV2.add("B");
        myHashSetV2.add("C");
        myHashSetV2.add("D");
        myHashSetV2.add("WORLD");

        boolean contains = myHashSetV2.contains("WORLD");
        System.out.println("contains = " + contains);

        System.out.println(myHashSetV2);
    }

}
