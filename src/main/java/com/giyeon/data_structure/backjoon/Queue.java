package com.giyeon.data_structure.backjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Queue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int initialNumber = sc.nextInt();
        sc.nextLine();
        List<Integer> objects = new ArrayList<>();


        for (int i = 0; i < initialNumber; i++) {

            String arrAndIndexLocation = sc.nextLine();
            String[] split = arrAndIndexLocation.split(" ");

            Integer arrLength = Integer.valueOf(split[0]);
            Integer index = Integer.valueOf(split[1]);

            String s = sc.nextLine();
            String[] split1 = s.split(" ");
            Integer[] integers = new Integer[arrLength];
            for (int j = 0; j < arrLength; j++) {
                String s1 = split1[j];
                Integer integer = Integer.valueOf(s1);
                integers[j] = integer;
            }


            ArrayList<Integer[]> arrArrayList = new ArrayList<>();
            for (int j = 0; j < arrLength; j++) {
                Integer[] integers1 = new Integer[2];
                integers1[0] = integers[j];
                integers1[1] = j;
                arrArrayList.add(integers1);
            }

            int count = 0;
            while (!arrArrayList.isEmpty()) {
                Integer[] first = arrArrayList.get(0);  // 맨 앞 요소 가져오기
                boolean foundLarger = false;

                // 더 큰 값이 있는지 확인
                for (int k = 1; k < arrArrayList.size(); k++) {
                    if (arrArrayList.get(k)[0] > first[0]) {
                        arrArrayList.add(arrArrayList.remove(0)); // 더 큰 값이 있으면 맨 뒤로 보내기
                        foundLarger = true;
                        break;
                    }
                }

                if (!foundLarger) {  // 더 큰 값이 없으면 출력 순서로 처리
                    count++;
                    Integer[] processed = arrArrayList.remove(0); // 출력된 요소 제거

                    if (processed[1] == index) {  // 원하는 인덱스인 경우
                        objects.add(count);
                        break;
                    }
                }

            }
            if (objects.size() == initialNumber) {
                for (Integer object : objects) {
                    System.out.println(object);
                }
            }

        }
    }
}

