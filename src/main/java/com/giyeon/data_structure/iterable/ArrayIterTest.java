package com.giyeon.data_structure.iterable;

import java.util.Iterator;

public class ArrayIterTest {

    public static void main(String[] args) {

        MyArray integerArray = new MyArray(new int[]{1, 2, 3, 4, 5});
        Iterator<Integer> iterator = integerArray.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("value = " + next);
        }

    }
}
