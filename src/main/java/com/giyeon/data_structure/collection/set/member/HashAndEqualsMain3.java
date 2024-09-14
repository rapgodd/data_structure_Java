package com.giyeon.data_structure.collection.set.member;

import com.giyeon.data_structure.collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {

    public static void main(String[] args) {
        /**
         * 객체의 id가 같음에도 불구하고
         * Object는 참조값을 기반으로 hashcode를 생성하기 때문에
         * 둘다 set자료구조에 들어간다
         */
        MyHashSetV2 myHashSetV2 = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");

        int i = m1.hashCode();
        System.out.println(i);
        int j = m2.hashCode();
        System.out.println(j);
        boolean equals = m1.equals(m2);
        System.out.println("equals = " + equals);

        myHashSetV2.add(m1);
        myHashSetV2.add(m2);
        System.out.println(myHashSetV2);

        /**
         * 검색도 실패한다.
         */
        Member a = new Member("A");
        boolean contains = myHashSetV2.contains(a);
        System.out.println("contains = " + contains);

    }

}
