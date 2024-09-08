package com.giyeon.data_structure.collection.link;

public class MyLinkedListMain2 {

    public static void main(String[] args) {

        MyLinkedListV2 list = new MyLinkedListV2();

        //마지막에 추가 O(n)
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list = " + list);

        //첫번째 항목에 추가, 삭제
        System.out.println("첫번쨰 항목에 추가");
        list.add(0, "d");
        System.out.println("list = " + list);

        System.out.println("첫번째 항목 삭제");
        list.remove(0);
        System.out.println("list = " + list);

        //중간 항목에 추가, 사제
        System.out.println("중간 항목에 추가");
        list.add(1, "e");

    }
}


