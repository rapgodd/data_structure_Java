package com.giyeon.data_structure.backjoon;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NewQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int initialNumber = sc.nextInt();

        for (int i = 0; i < initialNumber; i++) {
            String arrAndIndexLocation = sc.nextLine();
            String[] split = arrAndIndexLocation.split(" ");

            Integer arr = Integer.valueOf(split[0]);
            Integer index = Integer.valueOf(split[1]);

            Integer[] result = getResult(sc, arrAndIndexLocation);

            Map<Integer, Integer> integerIntegerHashMap = new LinkedHashMap<>();

            for (int j = 0; j < arr; j++) {
                integerIntegerHashMap.put(result[j], j);
            }

            int count = 0;
            //배열 안 맵의 중요도를 보고 뒤에 더 높은 중요도가 있으면 지금 이 데이터를 맨 뒤로 옮긴다.
            for (int j = 0; j < arr; j++) {
                integerIntegerHashMap.
            }

        }
    }

    private static Integer[] getResult(Scanner sc, String arrAndIndexLocation) {
        String arrInside = sc.nextLine();
        String[] result = arrInside.split(" ");

        Integer[] arr = new Integer[result.length];

        for (int i = 0; i < result.length; i++) {
            String s = result[i];
            Integer index = Integer.valueOf(s);
            arr[i] = index;
        }

        return arr;
    }
}
