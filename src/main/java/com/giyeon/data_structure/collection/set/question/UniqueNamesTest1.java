package com.giyeon.data_structure.collection.set.question;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {

    public static void main(String[] args) {

        int[] arr = {30, 20, 20, 10, 10};
        Set<Integer> hashSet = new HashSet<>();

        for (int i : arr) {
            hashSet.add(i);
        }
        System.out.println(hashSet);
    }

}
