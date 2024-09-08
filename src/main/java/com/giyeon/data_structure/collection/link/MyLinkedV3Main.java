package com.giyeon.data_structure.collection.link;

public class MyLinkedV3Main {

    public static void main(String[] args) {

        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();

        stringList.add("A");
        stringList.add("b");
//        stringList.add(3); int 가 들어갈 수 없음


        MyLinkedListV3<Integer> intList  = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

    }

}
