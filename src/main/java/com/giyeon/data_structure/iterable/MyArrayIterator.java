package com.giyeon.data_structure.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private int[] array;
    private int currentIndex = -1;

    public MyArrayIterator(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length - 1;
    }

    @Override
    public Integer next() {
        currentIndex++;
        int value = array[currentIndex];
        return value;
    }
}
