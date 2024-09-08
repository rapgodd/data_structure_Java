package com.giyeon.data_structure.ex2;


public class GenericBox1<T> {

    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

}
