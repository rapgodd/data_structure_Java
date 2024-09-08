package com.giyeon.data_structure.ex3;

import com.giyeon.data_structure.animal.Animal;

public class AnimalHospitalV2 <T extends Animal>{

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkOut() {
        String name = animal.getName();
        System.out.println("name = " + name);
        int size = animal.getSize();
        System.out.println("size = " + size);
    }

    public T compareDog(T targetAnimal) {
        T animal = this.animal.getSize() > targetAnimal.getSize() ? this.animal : targetAnimal;
        return animal;
    }

}
