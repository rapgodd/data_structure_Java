package com.giyeon.data_structure.backjoon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Stack {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            int requiredNum = sc.nextInt();
            arr[i] = requiredNum;
        }

        for (int i = 0; i < n; i++) {
            Integer integer = arr[i];
            for (int j = 1; j <= integer; j++) {
                stack.push(j);
                System.out.println("+");
            }
            stack.pop();
            System.out.println("-");
        }

    }

}
