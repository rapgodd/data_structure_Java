package com.giyeon.data_structure.collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elementData = new int[10];
    private int size = 0;

    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }
        return true;
    }

    private boolean contains(int value) {
        for (int elementDatum : elementData) {
            if (elementDatum == value) {
                return true;
            }
        }
        elementData[size] = value;
        size++;
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData,size)) +
                ", size=" + size +
                '}';
    }
}
