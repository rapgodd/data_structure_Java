package com.giyeon.data_structure.ex3;

import com.giyeon.data_structure.animal.Animal;
import com.giyeon.data_structure.animal.Cat;
import com.giyeon.data_structure.animal.Dog;

public class AnimalHospitalMain {

    public static void main(String[] args) {

        AnimalHospital dogHospital = new AnimalHospital();
        dogHospital.set(new Dog("멍멍이1", 100));
        dogHospital.checkOut();

        AnimalHospital catHospital = new AnimalHospital();
        catHospital.set(new Cat("냐옹이1", 300));
        catHospital.checkOut();

        Dog animal = (Dog) dogHospital.compareDog(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + animal);

    }

}
