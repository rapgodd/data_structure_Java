package com.giyeon.data_structure.collection.set;
import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    private static int Capacity = 10;

    public static void main(String[] args){

        //{1,2,5,8,14,99}
        LinkedList<Integer>[] buckets = new LinkedList[Capacity];
        System.out.println(Arrays.toString(buckets));
        for (int i = 0; i < Capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
        System.out.println(Arrays.toString(buckets));

        add(buckets,1);
        add(buckets,2);
        add(buckets,5);
        add(buckets,8);
        add(buckets,14);
        add(buckets, 99);
        add(buckets, 9);
        System.out.println(Arrays.toString(buckets));

    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndexValue = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndexValue];

        if(!bucket.contains(value)){
            bucket.add(value);
        }

    }

    private static boolean contains(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean contains = bucket.contains(value);
        return contains;
    }

    private static int hashIndex(int value) {
        return value % Capacity;
    }


}
