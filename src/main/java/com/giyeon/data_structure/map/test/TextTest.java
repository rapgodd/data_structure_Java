package com.giyeon.data_structure.map.test;

import java.util.HashMap;
import java.util.Map;

public class TextTest {

    public static void main(String[] args) {

        String text = "orange banana apple apple banana apple";
        String[] words = text.split(" ");

        Map<String, Integer> textMap = new HashMap<>();

        /**
         * 값이 있으면 하나 더 늘리고 없으면 새롭게 하나 넣어
         */
        for (String word : words) {
            if(textMap.containsKey(word)){
                textMap.put(word, textMap.get(word)+1);
            }else {
                textMap.put(word, 1);
            }
        }

        System.out.println("textMap = " + textMap);

    }

}
