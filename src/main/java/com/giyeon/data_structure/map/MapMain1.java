package com.giyeon.data_structure.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {

        /**
         * Map은 순서 보장 안되고
         * 중복을 허용하지 않는다. (key)
         *
         * Value는 순서는 보징되지 않지만
         * 중복을 허용한다.
         */
        Map<String, Integer> map = new HashMap<>();

        map.put("StudentA", 100);
        map.put("StudentB", 49);
        map.put("StudentC", 50);
        map.put("StudentD", 51);
        System.out.println(map);

        Integer stuA = map.get("StudentA");
        System.out.println(stuA);

        Set<String> strings = map.keySet();

        for (String string : strings) {
            Integer valueOfStudentGrade = map.get(string);
            System.out.println("Student : "+string+", valueOfStudentGrade = " + valueOfStudentGrade);
        }

        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key+", value = " + value);
        }

        /**
         * Value만 꺼내고 싶을떄
         */
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }
    }

}
