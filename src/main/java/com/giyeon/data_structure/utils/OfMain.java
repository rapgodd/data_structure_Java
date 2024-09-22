package com.giyeon.data_structure.utils;

import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {

    public static void main(String[] args) {

        //of를 사용하면 리스트를 만들어 주는데
        //변경이 불가능하다.
        List<Integer> integers = List.of(1, 2, 3);
        Map<Integer, String> integerStringMap = Map.of(1, "기연", 2, "윤지", 3, "아이스크림");
        Set.of(12, 34, 24, 53);



    }

}
