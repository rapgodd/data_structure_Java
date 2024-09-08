package com.giyeon.data_structure.ex5;

import com.giyeon.data_structure.animal.Animal;
import com.giyeon.data_structure.animal.Cat;
import com.giyeon.data_structure.animal.Dog;

public class WildCardMain1 {

    public static void main(String[] args) {

        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("ddd", 19));

        WildCardEx.printAnimalV1(dogBox);

        WildCardEx.printAnimalV2(catBox);

        Dog dog = WildCardEx.printAndReturnAnimalV1(dogBox);

        Animal animal = WildCardEx.printAndReturnWildCard(dogBox);

    }

}
