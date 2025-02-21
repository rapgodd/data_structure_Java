package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;
public class Multiply {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> eachNumStorage = new HashMap<>();


        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        int intC = Integer.parseInt(c);

        //세수 곱한 값
        int result = intA * intB * intC;


        initHashMap(eachNumStorage);
        mapInputToHashmap(eachNumStorage, result);
        resultFromValues(eachNumStorage, sb);


        //그 결과를 출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    public static void initHashMap(HashMap<String,Integer> eachNumStorage){
        for(int i =0; i<=9; i++){
            eachNumStorage.put(String.valueOf(i), 0);
        }
    }

    public static void mapInputToHashmap(HashMap<String,Integer> eachNumStorage, int result){
        String stringResult = Integer.toString(result);
        String[] arrayResult = stringResult.split("");

        for(int i=0; i<arrayResult.length; i++){
            String key = arrayResult[i];
            int value = eachNumStorage.get(key);
            eachNumStorage.put(key, value + 1);
        }
    }

    public static void resultFromValues(HashMap<String,Integer> eachNumStorage, StringBuilder sb){

        for(int i=0; i<10; i++){
            int mappedNum = eachNumStorage.get(String.valueOf(i));
            sb.append(mappedNum);
            sb.append("\n");
        }
    }

}
