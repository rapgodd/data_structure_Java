package com.giyeon.data_structure.backjoon;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] split = input.split(" ");
        int i = Integer.parseInt(split[0]);
        int j = Integer.parseInt(split[1]);
        int k = Integer.parseInt(split[2]);

        if(i == j && k == i){
            System.out.println(1000 + i * 1000);
        } else if (i == j) {
            System.out.println(1000 + i * 100);
        } else if (k == i) {
            System.out.println(1000 + k * 100);
        } else if (j == k) {
            System.out.println(1000 + k * 100);
        } else{
            int i1 = (i > j) ? ((i > k) ? i : k) : ((j > k) ? j : k);
            System.out.println(i1*100);
        }
    }

}

