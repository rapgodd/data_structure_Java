package com.giyeon.data_structure.collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();

        set.add(1);
        set.add(2);//o(n)
        set.add(3);//o(n)
        set.add(4);//o(n)
        set.add(5);//o(n)

        System.out.println(set);

        boolean result = set.add(4);
        System.out.println("중복 데이터 저장 결과 :" + result);
        System.out.println(set);





    }
}
