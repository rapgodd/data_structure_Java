package com.giyeon.data_structure.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        return obj;
    }

    public static <T> T genericMethod(T obj) {
        System.out.println("obj = " + obj);
        return obj;
    }

    public static <T extends Number> T numberMethod (T obj) {
        System.out.println("obj = " + obj);
        return obj;
    }

}
