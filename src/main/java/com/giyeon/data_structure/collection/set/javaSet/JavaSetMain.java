package com.giyeon.data_structure.collection.set.javaSet;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        run(hashSet);
        run(linkedHashSet);
        run(treeSet);

    }


    public static void run(Set<String> set) {
        System.out.println(set.getClass());

        set.add("A");
        set.add("H");
        set.add("V");
        set.add("G");
        set.add("W");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

    }

}
