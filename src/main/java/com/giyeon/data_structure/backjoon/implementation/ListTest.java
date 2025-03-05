package com.giyeon.data_structure.backjoon.implementation;

import java.util.*;

public class ListTest {

    public static void main(String[] args) {


        // 리스트를 toString하면 어떻게 바뀌는가?
        List list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.toString());

        // List<ArrayList<Integer>> 의 경우에 정렬을 그냥 default로 하면 어떻게 되는가 ?
        List<ArrayList<Integer>> parentList = new ArrayList<>();
        ArrayList<Integer> integers1 = new ArrayList<>();
        ArrayList<Integer> integers2 = new ArrayList<>();

        integers1.add(1);
        integers1.add(5);
        integers1.add(6);

        integers2.add(1);
        integers2.add(2);
        integers2.add(3);

        parentList.add(integers1);
        parentList.add(integers2);

        //정렬 테스트
//        Collections.sort(parentList); 에러 : [리스트 안 요소들이 정렬가능해야(Comparable)한다.]

        // "1 2 3", "1 3 5" 숫자 문자열 정렬 테스트
        String a = "1 4 5";
        String b = "1 3 4";
        String c = "1 2 3";

        List<String> stringList = new ArrayList<>();
        stringList.add(a);
        stringList.add(b);
        stringList.add(c);

        System.out.println("before :" + stringList);
        Collections.sort(stringList);
        System.out.println("after :" + stringList);

        //결과 출력 :
        //before :[1 4 5, 1 3 4, 1 2 3]
        //after :[1 2 3, 1 3 4, 1 4 5]

        // "1 3 4", "1 2 3"의 문자열은
        // Collections.sort()를 하면
        // 숫자 리스트형 문자열을 자동으로
        // 숫자처럼 인식해서 오름차순으로 정렬해준다.
    }

}
