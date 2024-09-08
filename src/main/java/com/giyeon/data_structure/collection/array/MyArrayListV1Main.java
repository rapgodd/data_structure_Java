package com.giyeon.data_structure.collection.array;

public class MyArrayListV1Main {

    public static void main(String[] args) {

        MyArrayListV1 myArrayListV1 = new MyArrayListV1();
        System.out.println(myArrayListV1);
        myArrayListV1.add("a");
        System.out.println(myArrayListV1);
        myArrayListV1.add("b");
        System.out.println(myArrayListV1);
        myArrayListV1.add("c");
        System.out.println(myArrayListV1);

        System.out.println("myArrayListV1.size() = " + myArrayListV1.size());

        //배열의 허용범위를 넘어서는 경우
        myArrayListV1.add("d");
        System.out.println(myArrayListV1);
        myArrayListV1.add("e");
        System.out.println(myArrayListV1);
        myArrayListV1.add("f");
        System.out.println(myArrayListV1);



    }

}
