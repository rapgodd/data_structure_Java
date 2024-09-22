package com.giyeon.data_structure.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {

        /**
         * 먼저 불변한 리스트를 만들고 이를 다시 가변리스트로 만들 것이다.
         * 그리고 마지막으로 불변 리스트로 전환해 볼것이다
         *
         * list -> ImmutableList -> list
         */
        List<Integer> integers = List.of(1, 2, 3);
        List<Integer> list = new ArrayList<>(integers);
        list.add(4);
        System.out.println("list = " + list);
        //가변 -> 불변으로 만들기
        List<Integer> unmodifiableList = Collections.unmodifiableList(list);

    }

}
