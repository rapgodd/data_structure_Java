package com.giyeon.data_structure.ex5;

import com.giyeon.data_structure.animal.Animal;

public class WildCardEx {

    static <T> void printGenericV1(Box<T> t) {
        System.out.println("t.get() = " + t.get());
    }

    static <T extends Animal> void printAnimalV1(Box<T> t) {
        System.out.println("t.get() = " + t.get());
    }

    static <T extends Animal> void printAnimalV2(Box<T> t) {
        System.out.println("t.get() = " + t.get());
    }

    static <T extends Animal> T printAndReturnAnimalV1(Box<T> t) {
        T t1 = t.get();
        return t1;
    }


    static void WildCardMethod(Box<?> t) {
        Object o = t.get();
        System.out.println("o = " + o);
    }

    static Animal printAndReturnWildCard(Box<? extends Animal> t) {
        Animal animal = t.get();
        return animal;
    }

    //와일드 카드로는 타입을 반환할때, 부모 타입만 반환이 가능하다. 왜 ?
    //?는 공유가 가능하지 않기 때문이다.
}
