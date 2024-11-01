package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class NumCardSet {

    public static void main(String[] args) throws IOException{

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer.parseInt(br.readLine());

        //숫자를 받아와서
        //Set에 담아 넣는다.
        HashSet<Integer> numberCollections = new HashSet<>();
        makeHashSetOfNumberCollection(numberCollections,br);

        //M받아오기
        //M가져올 Array생성
        //배열 값들 채우기
        int comparingNumberAmount = Integer.parseInt(br.readLine());
        int[] arrayForComparingNumber = new int[comparingNumberAmount];
        fillArrayForComparingNumber(arrayForComparingNumber, br);

        //Array와 HashSet을 비교하기
        compareArrayAndHashSetAndFillSb(sb, numberCollections, arrayForComparingNumber);

        //출력
        String result = sb.toString();
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();

    }





    private static void makeHashSetOfNumberCollection(HashSet<Integer> numberCollections,BufferedReader br) throws IOException{
        String[] numberArray = br.readLine().split(" ");
        for(String number: numberArray){
            int eachNumber = Integer.parseInt(number);
            numberCollections.add(eachNumber);
        }
    }

    private static void fillArrayForComparingNumber(int[] arrayForComparingNumber,BufferedReader br) throws IOException{
        String[] numberArray = br.readLine().split(" ");
        for (int i = 0; i < arrayForComparingNumber.length; i++) {
            arrayForComparingNumber[i] = Integer.parseInt(numberArray[i]);
        }
    }

    private static void compareArrayAndHashSetAndFillSb(StringBuilder sb, HashSet<Integer> numberCollections, int[] arrayForComparingNumber) {
        for(int i = 0; i<arrayForComparingNumber.length; i++){
            if(numberCollections.contains(arrayForComparingNumber[i])){
                sb.append("1"+" ");
            }else{
                sb.append("0"+" ");
            }
        }
    }

}
