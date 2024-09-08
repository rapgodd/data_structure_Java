package com.giyeon.data_structure.ex5;

import com.giyeon.data_structure.animal.Animal;
import com.giyeon.data_structure.animal.Cat;
import com.giyeon.data_structure.animal.Dog;

public class WildCardMain2 {

    public static void main(String[] args) {

        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(animalBox);

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
    //extends는 상한인데 super는 하한이다.
    //즉, 물음표가 Animal보다 높아야 한다.

}
