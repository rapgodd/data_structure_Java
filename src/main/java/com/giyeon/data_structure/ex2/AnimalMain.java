package com.giyeon.data_structure.ex2;

import com.giyeon.data_structure.animal.Animal;
import com.giyeon.data_structure.animal.Cat;
import com.giyeon.data_structure.animal.Dog;

public class AnimalMain {

    public static void main(String[] args) {

        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("강아지",100);
        Cat cat = new Cat("고양이",20);

        GenericBox1<Dog> dogGenericBox1 = new GenericBox1<>();
        dogGenericBox1.set(dog);
        Dog dog1 = dogGenericBox1.get();
        System.out.println("dog1 = " + dog1);


        GenericBox1<Cat> catGenericBox1 = new GenericBox1<>();
        catGenericBox1.set(cat);
        Cat cat1 = catGenericBox1.get();
        System.out.println("cat1 = " + cat1);


    }

}
