package com.giyeon.data_structure.ex4;

import com.giyeon.data_structure.animal.Cat;
import com.giyeon.data_structure.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이",1);
        Cat cat = new Cat("내엉아", 1);


        ComplexBox<Dog> dogComplexBox = new ComplexBox<>();
        dogComplexBox.set(dog);

        Cat cat1 = dogComplexBox.printAndReturn(cat);
        System.out.println("cat1 = " + cat1);

    }
}
