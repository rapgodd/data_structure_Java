package com.giyeon.data_structure.ex4;

public class GenericMethodMain {

    public static void main(String[] args) {
        Integer i = 10;
        Integer i1 = (Integer) GenericMethod.objMethod(i);
        System.out.println(i1);

        Integer i2 = GenericMethod.<Integer>genericMethod(i);
        System.out.println("i2 = " + i2);

        Number integer = GenericMethod.<Number>numberMethod(2323);
        System.out.println("integer = " + integer);

    }

}
