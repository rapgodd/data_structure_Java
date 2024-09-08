package com.giyeon.data_structure.ex4;

import com.giyeon.data_structure.animal.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T t) {
        this.animal = t;
    }

    public <T> T printAndReturn(T t) {
        System.out.println("animal name = " + animal.getClass().getName());
        System.out.println("t.classname" + t.getClass().getName());
        return t;
    }
    /**
     * 이렇게 하고 클래스에서 Dog타입 지정하고 printAndReturn에서
     * Cat타입을 지정해주면, 당연히 더 구체적인 Cat 타입이 반환된다.
     */



}
