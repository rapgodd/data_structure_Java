package com.giyeon.data_structure.collection.list;

public class MyListPerformanceTest {

    public static void main(String[] args) {

        int size = 50_000;
        System.out.println("처음에 추가했을때 계산속도 차이");
        addFirst(new MyArrayList<>(), size);
        addFirst(new MyLinkedList<>(), size);

        System.out.println("평균에 추가했을때 계산속도 차이");
        addMid(new MyArrayList<>(), size);
        addMid(new MyLinkedList<>(), size);

        System.out.println("마지막에 추가했을때 계산속도 차이");
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        addLast(myArrayList, size);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        addLast(myLinkedList, size);

        int loop = 10000;
        System.out.println("myArrayList 조회");
        getIndex(myArrayList,loop,0);
        getIndex(myArrayList,loop,size/2);
        getIndex(myArrayList,loop,size-1);

        System.out.println("myLinkedList 조회");
        getIndex(myLinkedList,loop,0);
        getIndex(myLinkedList,loop,size/2);
        getIndex(myLinkedList,loop,size-1);

        System.out.println("myArrayList 검색");
        search(myArrayList,loop,0);
        search(myArrayList,loop,size/2);
        search(myArrayList,loop,size-1);

        System.out.println("myLinkedList 검색");
        search(myLinkedList,loop,0);
        search(myLinkedList,loop,size/2);
        search(myLinkedList,loop,size-1);


    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산시간: " + (endTime - startTime));
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(" 반복: " + loop + ", 계산시간: " + (endTime - startTime));
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("앞에 추가 - 크기: " + size + ", 계산시간" + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2 , i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("평균에 추가: " + size + ", 계산시간" + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("마지막에 추가: " + size + ", 계산시간" + (endTime - startTime) + "ms");
        //ArrayList는 빨리 찾고 LinkedList는 오래 걸릴 것이다.
    }
}
