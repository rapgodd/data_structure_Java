package com.giyeon.data_structure.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain1 {

    public static void main(String[] args) {

        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, new AscComparator());
        System.out.println(Arrays.toString(array));

        //reverse한것
        Arrays.sort(array, new AscComparator().reversed());
        System.out.println(Arrays.toString(array));
    }

    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return (o1 < o2) ? -1 : (o1 == o2) ? 0 : 1;
        }
    }

}
