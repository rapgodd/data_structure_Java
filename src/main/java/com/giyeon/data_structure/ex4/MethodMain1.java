package com.giyeon.data_structure.ex4;

import com.giyeon.data_structure.animal.Cat;
import com.giyeon.data_structure.animal.Dog;

public class MethodMain1 {

    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", 200);
        Cat cat = new Cat("냐옹이", 50);

        AnimalMethod.checkOut(dog);
        AnimalMethod.checkOut(cat);

        Dog dog1 = new Dog("큰 멍멍이", 300);
        Dog bigger = AnimalMethod.compareDog(dog, dog1);

        System.out.println("bigger = " + bigger);


    }

}
