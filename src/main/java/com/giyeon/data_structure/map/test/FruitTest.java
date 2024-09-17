package com.giyeon.data_structure.map.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FruitTest {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("apple",500);
        map.put("바나나",500);
        map.put("망고",1000);
        map.put("딸기",1000);

        Set<String> fruits = map.keySet();
        for (String fruit : fruits) {
            Integer integer = map.get(fruit);

            if (integer == 1000) {
                System.out.println("fruit = " + fruit);
            }
        }
    }
}
