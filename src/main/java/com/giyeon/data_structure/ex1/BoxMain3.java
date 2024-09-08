package com.giyeon.data_structure.ex1;

public class BoxMain3 {

    public static void main(String[] args) {

        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.set(10);
        Integer integer = integerGenericBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.set("Hello");
        String s = stringGenericBox.get();
        System.out.println("s = " + s);

//        GenericBox genericBox = new GenericBox();
//        genericBox.set(10);
//        Integer o = (Integer)genericBox.get();
//        System.out.println("o = " + o);

    }

}
