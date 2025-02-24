package com.giyeon.data_structure.backjoon.implementation;

import java.util.*;
import java.io.*;

public class Q25305 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String totalAndCutLine = br.readLine();
        String[] array = totalAndCutLine.split(" ");
        String totalStr = array[0];
        String cutLineStr = array[1];

        int total = Integer.parseInt(totalStr);
        int cutLine = Integer.parseInt(cutLineStr);

        List<Integer> gradeStore = new ArrayList<>(total);


        String[] gradeArr = getGrades(br);
        fillInStore(total, gradeStore, gradeArr);
        int cutLineValue = getCutLine(gradeStore, cutLine);

        bw.write(String.valueOf(cutLineValue));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int getCutLine(List<Integer> gradeStore, int cutLine) {
        Collections.sort(gradeStore, Collections.reverseOrder());
        int cutLineValue = gradeStore.get(cutLine - 1);
        return cutLineValue;
    }

    private static void fillInStore(int total, List<Integer> gradeStore, String[] gradeArr) {
        for(int i = 0; i< total; i++){
            gradeStore.add(Integer.parseInt(gradeArr[i]));
        }
    }

    private static String[] getGrades(BufferedReader br) throws IOException {
        String grades = br.readLine();
        String[] gradeArr = grades.split(" ");
        return gradeArr;
    }

}
