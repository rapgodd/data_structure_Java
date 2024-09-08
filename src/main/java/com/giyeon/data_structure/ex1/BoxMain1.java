package com.giyeon.data_structure.ex1;

public class BoxMain1 {


    public static void main(String[] args) {

        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);

        Integer integer = integerBox.get();
        System.out.println(integer);

        StringBox stringBox = new StringBox();
        stringBox.setValue("hello");
        String value = stringBox.getValue();
        System.out.println(value);
    }
}
