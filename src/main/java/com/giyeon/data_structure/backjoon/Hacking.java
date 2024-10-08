package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hacking {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loopNum = Integer.parseInt(br.readLine());

        List<String> lists = new ArrayList<>();

        for (int i = 0; i < loopNum; i++) {//상수번 계산 A
            String s = br.readLine();
            String[] inputStringArr = s.split("");//백만번

            LinkedList<String> answer = new LinkedList<>();
            int index = 0;

            for (String string : inputStringArr) {//백만번
                if(!string.equals("<")&&!string.equals(">")&&!string.equals("-")) {
                    answer.add(index,string);
                    index++;
                }

                if (string.equals("<") && index >= 1) {
                    index--;
                }

                if (string.equals(">") && !(index == answer.size())) {
                    index++;
                }

                if (string.equals("-") && !(index==0)) {
                    answer.remove(index - 1);
                    index--;
                }
            }

            StringBuilder stringBuilder = new StringBuilder();
            for (String s1 : answer) {
                stringBuilder.append(s1);
            }//백만번
            lists.add(stringBuilder.toString());
        }

        for (String list : lists) {
            bw.write(list+"\n");
        }

        bw.flush();

        br.close();
        bw.close();

    }
}
