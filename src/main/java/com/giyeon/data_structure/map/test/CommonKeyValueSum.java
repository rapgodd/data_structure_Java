package com.giyeon.data_structure.map.test;

import java.util.*;

public class CommonKeyValueSum {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        List<String> list = new ArrayList<>();

        for(String key :map1.keySet()){
            boolean b = map2.containsKey(key);
            if(b){
                list.add(key);
            }
        }

        int sum = 0;
        for (String key : list) {
            Integer integer1 = map1.get(key);
            Integer integer2 = map2.get(key);
            sum += integer1+integer2;
        }

        System.out.println("sum = " + sum);

    }

}
