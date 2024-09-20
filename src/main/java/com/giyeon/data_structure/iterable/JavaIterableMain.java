package com.giyeon.data_structure.iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaIterableMain {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("next = "+next);
        }
        foreach(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Iterator<Integer> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Integer next = iterator1.next();
            System.out.println("next = " + next);
        }
        foreach(set);



    }

    private static void foreach(Iterable<Integer> collection) {
        for (Integer integer : collection) {
            System.out.println("integer = " + integer);
        }
    }

}
