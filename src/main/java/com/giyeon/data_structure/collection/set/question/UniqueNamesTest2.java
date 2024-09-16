package com.giyeon.data_structure.collection.set.question;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {

    public static void main(String[] args) {

        Integer[] arr = {5, 30, 20, 20, 10, 10};
        List<Integer> arr1 = List.of(arr);
        Set<Integer> hashSet = new LinkedHashSet<>(arr1);

        for(Integer i : hashSet) {
            System.out.print(i+" ");
        }

    }

}
