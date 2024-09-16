package com.giyeon.data_structure.map;

import java.util.HashMap;

public class MapMain3 {

    public static void main(String[] args) {

        HashMap<String, Integer> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("A", 1);
        objectObjectHashMap.put("A", 2);

        objectObjectHashMap.putIfAbsent("A",303030);
        objectObjectHashMap.putIfAbsent("B",3232);
        System.out.println(objectObjectHashMap);
    }
}
