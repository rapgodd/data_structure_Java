package com.giyeon.data_structure.map.test;

import java.util.Scanner;

public class CodingTest1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String stringA = scanner.nextLine();
        String[] stringArr = stringA.split(" ");

        int sum = 0;
        for (String string : stringArr) {
            long num = Long.parseLong(string);
            sum += num;
        }
        System.out.println(sum);
    }
}
