package com.giyeon.data_structure.ex3;

import com.giyeon.data_structure.animal.Animal;

public class AnimalHospital {

    private Animal animal;

    public void set(Animal animal) {
        this.animal = animal;
    }

    public void checkOut() {
        String name = animal.getName();
        System.out.println("name = " + name);
        int size = animal.getSize();
        System.out.println("size = " + size);
    }

    public Animal compareDog(Animal targetAnimal) {
        Animal animal = this.animal.getSize() > targetAnimal.getSize() ? this.animal : targetAnimal;
        return animal;
    }

}
