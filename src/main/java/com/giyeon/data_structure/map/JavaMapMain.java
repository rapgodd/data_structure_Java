package com.giyeon.data_structure.map;

import java.util.*;

public class JavaMapMain {

    public static void main(String[] args) {
        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());

    }

    public static void run(Map<String, Integer> map) {

        map.put("A", 100);
        map.put("B", 200);
        map.put("C", 300);
        map.put("D", 400);
        map.put("E", 500);
        map.put("F", 600);
        map.put("G", 700);
        map.put("H", 800);
        map.put("I", 900);
        map.put("J", 1000);
        map.put("K", 1100);
        map.put("L", 1200);
        System.out.println("map = " + map);

        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("next = " + next + ", value = " + map.get(next));
        }

    }

}
