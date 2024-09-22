package com.giyeon.data_structure.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {

    public static void main(String[] args) {
        /**
         * 리스트를 동시접근을 하면 동기화 문제가 발생한다.
         * 이를 해결하기 위해 Collection의 메서드를 사용할 수 있다.
         */
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> integers = Collections.synchronizedList(list);
        System.out.println(integers);
    }

}
