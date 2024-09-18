package com.giyeon.data_structure.map.test;

import java.util.Scanner;

public class ArrayToMapTest1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valueA = scanner.nextInt();
        int valueB = scanner.nextInt();

        String stringValue = Integer.toString(valueB);
        String[] arr = stringValue.split("");

        int sum = 0;
        for(int i=arr.length-1; i>=0; i--){
            int num = Integer.parseInt(arr[i]);
            int calculatedNum = num*valueA;
            sum += calculatedNum;
            System.out.println(calculatedNum);
        }
        System.out.println(valueA*valueB);
    }
}
