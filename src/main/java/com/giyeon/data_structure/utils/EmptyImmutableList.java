package com.giyeon.data_structure.utils;

import java.util.List;

public class EmptyImmutableList {

    public static void main(String[] args) {

        /**
         * 불변 빈 리스트를 생성하기
         * 값이 없다는 것을 보여줄때 사용 가능하다.
         */
        List<Integer> objects = List.of();
        System.out.println("objects = " + objects);

    }

}
