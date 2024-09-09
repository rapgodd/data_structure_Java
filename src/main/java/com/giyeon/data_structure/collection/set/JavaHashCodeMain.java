package com.giyeon.data_structure.collection.set;

import com.giyeon.data_structure.collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {

        //Object의 기본 hashcode는 객체의 참조값을 기반으로 생성.
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        //클래스마다 hashCode 메서드를 다 이미 오버라이딩 해 두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println(i.hashCode());
        System.out.println(strA.hashCode());
        System.out.println(strAB.hashCode());

        /**
         * hashCode는 마이너스 값이 들어올 수 있다.
         */
        Integer a = -1;
        int i1 = a.hashCode();
        System.out.println("i1 = " + i1);


        /**
         *인스턴스는 다르지만, equals는 같다.
         */
        Member memberA = new Member("A");
        Member memberB = new Member("A");

        /**
         * equals, hashCode를 오버라이딩 하지 않은 경우와, 한 경우를 비교.
         */
        System.out.println(memberA.equals(memberB));
        System.out.println(memberA.hashCode());
        System.out.println(memberB.hashCode());
    }

}
