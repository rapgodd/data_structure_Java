package com.giyeon.data_structure.backjoon;

import java.util.Scanner;

public class Music{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        if(a.equals("1 2 3 4 5 6 7 8")){
            System.out.println("ascending");
        }else if(a.equals("8 7 6 5 4 3 2 1")){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }

    }
}