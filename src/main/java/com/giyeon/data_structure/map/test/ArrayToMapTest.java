package com.giyeon.data_structure.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {
                                    {"Java","10000"}
                                   ,{"Spring","20000"}
                                   ,{"python","30000"}  };

        //주어진 배열로부터 맵 생성
        Map<String, Integer> productMap = new HashMap<>();
        for (String[] strings : productArr) {
            String key = strings[0];
            String value = strings[1];
            productMap.put(key,Integer.valueOf(value));
        }

        //Map에서 키랑 밸류 다 뽑자
        for (String key : productMap.keySet()) {
            System.out.println("Key :"+key+", Value:"+productMap.get(key));
        }
    }

}
