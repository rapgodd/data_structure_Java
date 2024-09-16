package com.giyeon.data_structure.map;

import java.util.HashMap;

public class MapMain2 {

    public static void main(String[] args) {

        HashMap<String, Integer> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("A", 1);
        objectObjectHashMap.put("A", 2);
        System.out.println("objectObjectHashMap = " + objectObjectHashMap);

        boolean b = objectObjectHashMap.containsKey("B");
        System.out.println("contains value B = " + b);

        objectObjectHashMap.remove("A");
        System.out.println("Map = " + objectObjectHashMap);
    }

}
