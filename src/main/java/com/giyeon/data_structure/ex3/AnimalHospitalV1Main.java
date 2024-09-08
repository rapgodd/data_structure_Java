package com.giyeon.data_structure.ex3;

import com.giyeon.data_structure.animal.Cat;
import com.giyeon.data_structure.animal.Dog;

public class AnimalHospitalV1Main {

    public static void main(String[] args) {
        AnimalHospitalV2<Dog> animalDogHospitalV2 = new AnimalHospitalV2<>();
        animalDogHospitalV2.set(new Dog("멍멍이1", 100));
        animalDogHospitalV2.checkOut();

        AnimalHospitalV2<Cat> animalCatHospitalV2 = new AnimalHospitalV2<>();
        animalCatHospitalV2.set(new Cat("냐옹이1", 300));
        animalCatHospitalV2.checkOut();

        Dog dog = animalDogHospitalV2.compareDog(new Dog("멍멍이V2", 200));
        System.out.println(dog);
    }

}
