package com.giyeon.data_structure.ex2;

import com.giyeon.data_structure.animal.Animal;
import com.giyeon.data_structure.animal.Cat;
import com.giyeon.data_structure.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {

        Animal animal = new Animal("동물", 10);
        Cat cat = new Cat("고양이", 30);
        Dog dog = new Dog("강아지", 50);

        GenericBox1<Animal> animalGenericBox1 = new GenericBox1<>();
        animalGenericBox1.set(animal);
        animalGenericBox1.set(dog);
        animalGenericBox1.set(cat);

        Animal animal1 = animalGenericBox1.get();
        System.out.println("animal1 = " + animal1);

    }
}
