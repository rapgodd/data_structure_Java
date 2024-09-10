package com.giyeon.data_structure.collection.set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class MyHashSetV2 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size;
    private int capacity = DEFAULT_INITIAL_CAPACITY;


    public MyHashSetV2() {
        initialMethod();
    }

    public MyHashSetV2(int value) {
        this.capacity = value;
        initialMethod();
    }

    private void initialMethod() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value){
        int index = hashIndex(value);
        LinkedList<Object> bucket = buckets[index];
        if(bucket.contains(value)){
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(Object  value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);
        if(result){
            size--;
            return true;
        }else{
            return false;
        }
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

    private int hashIndex(Object value){
        int hashCode = value.hashCode();
        int hashIndex = Math.abs(hashCode) % capacity;
        return hashIndex;
    }
}
