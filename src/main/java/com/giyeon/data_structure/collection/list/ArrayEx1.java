package com.giyeon.data_structure.collection.list;

import java.util.ArrayList;

public class ArrayEx1 {

    public static void main(String[] args) {

        ArrayList<Integer> students = new ArrayList<>();
        students.add(90);
        students.add(80);
        students.add(70);
        students.add(60);
        students.add(50);

        int total = 0;
        for (int i = 0; i < students.size(); i++) {
            total += students.get(i);
        }
        System.out.println(total);

        double average = total / students.size();
        System.out.println("점수 총합" + total);
        System.out.println("점수 평균" + average);



    }

}
