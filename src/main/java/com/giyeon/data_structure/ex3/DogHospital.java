package com.giyeon.data_structure.ex3;

import com.giyeon.data_structure.animal.Dog;

public class DogHospital {

    private Dog animal;

    public void set(Dog animal) {
        this.animal = animal;
    }

    public void checkOut() {
        String name = animal.getName();
        System.out.println("name = " + name);
        int size = animal.getSize();
        System.out.println("size = " + size);
    }

    public Dog compareDog(Dog targetDog) {
        Dog dog = this.animal.getSize() > targetDog.getSize() ? this.animal : targetDog;
        return dog;
    }
}
