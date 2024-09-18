package com.giyeon.data_structure.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    //코드작성
    public static void main(String[] args) {
        System.out.println("==단어입력 단계==");
        Scanner scanner = new Scanner(System.in);
        Map<String,String> map = new HashMap<>();
        map.put("apple","사과");
        map.put("banana","바나나");

        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'):");
            String s = scanner.nextLine();
            if(s.equals("q")){
                break;
            }
            if(!map.containsKey(s)){
                System.out.println(s+"은(는) 사전에 없는 단어입니다.");
            }else {
                String value = map.get(s);
                System.out.println("value = " + value);
            }
        }
    }

}
