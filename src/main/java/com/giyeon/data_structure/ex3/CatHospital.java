package com.giyeon.data_structure.ex3;

import com.giyeon.data_structure.animal.Cat;
import com.giyeon.data_structure.animal.Dog;

public class CatHospital {

    private Cat animal;

    public void set(Cat animal) {
        this.animal = animal;
    }

    public void checkOut() {
        String name = animal.getName();
        System.out.println("name = " + name);
        int size = animal.getSize();
        System.out.println("size = " + size);
    }

    public Cat compareDog(Cat targetCat) {
        Cat cat = this.animal.getSize() > targetCat.getSize() ? this.animal : targetCat;
        return cat;
    }

}
