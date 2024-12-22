package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class BJ1316 {

    public static int countAnswerWords = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int i = Integer.parseInt(br.readLine());

        countEachWordIfRequiredWords(br,i);
        sb.append(countAnswerWords);
        String answer = sb.toString();
        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();
    }

    private static void countEachWordIfRequiredWords(BufferedReader br, int i) throws IOException {

        //HashMap에 주어진 단어 알파벳,적혀진 횟수 적고 그거 기반으로 단어 생성해서 String.contains 할것이다
        for (int j = 0; j < i; j++) {
            HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
            String word = br.readLine();
            String[] split = word.split("");

            for (String s : split) {
                if(stringIntegerHashMap.containsKey(s)) {
                    int alphabetUsedTime = stringIntegerHashMap.get(s);
                    stringIntegerHashMap.put(s, alphabetUsedTime + 1);
                }else{
                    stringIntegerHashMap.put(s, 1);
                }
            }

            List<HashMap.Entry<String, Integer>> entryList = new ArrayList<>(stringIntegerHashMap.entrySet());
            for (int k = 0; k < entryList.size(); k++) {

                StringBuilder sb = new StringBuilder();
                String key = entryList.get(k).getKey();
                int value = entryList.get(k).getValue();

                for (int w = 0; w < value; w++) {
                    sb.append(key);
                }

                String resultString = sb.toString();
                if (!word.contains(resultString)) {
                    break;
                }

                if (k == entryList.size() - 1) {
                    countAnswerWords++;
                }

            }

        }
    }

}
