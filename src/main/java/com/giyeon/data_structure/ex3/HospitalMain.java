package com.giyeon.data_structure.ex3;

import com.giyeon.data_structure.animal.Cat;
import com.giyeon.data_structure.animal.Dog;

public class HospitalMain {

    public static void main(String[] args) {

        CatHospital catHospital = new CatHospital();
        catHospital.set(new Cat("고양이", 20));
        catHospital.checkOut();

        DogHospital dogHospital = new DogHospital();
        dogHospital.set(new Dog("강아지", 50));
        dogHospital.checkOut();

        Dog dog = dogHospital.compareDog(new Dog("멍멍이2", 200));
        System.out.println("dog = " + dog);

    }

}
