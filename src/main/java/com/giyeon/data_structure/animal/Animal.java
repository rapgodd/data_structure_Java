package com.giyeon.data_structure.animal;


public class Animal {

    private String name;
    private int size;

    public Animal(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    public void sound() {
        System.out.println("동물 울음소리");
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
