package com.giyeon.data_structure.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();


        System.out.println("n개의 정수를 입력하세요. : ");
        while (true) {
            int line = sc.nextInt();
            if (line == 0) {
                break;
            }
            list.add(line);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
