package com.giyeon.data_structure.ex1;

public class BoxMain2 {

    public static void main(String[] args) {

        ObjectValue stringBox = new ObjectValue();
        stringBox.setValue("안녕하세요");
        Object value = stringBox.getValue();
        System.out.println(value);

        ObjectValue integerBox = new ObjectValue();
        integerBox.setValue(12);
        Object value1 = integerBox.getValue();
        System.out.println(value1);

        

    }


}
