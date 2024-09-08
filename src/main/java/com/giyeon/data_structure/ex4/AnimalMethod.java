package com.giyeon.data_structure.ex4;

import com.giyeon.data_structure.animal.Animal;

public class AnimalMethod {

    public static <T extends Animal> void checkOut(T t) {
        String name = t.getName();
        System.out.println("name = " + name);
        int size = t.getSize();
        System.out.println("size = " + size);
    }

    public static <T extends Animal> T compareDog(T t1, T t2) {
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }

}
