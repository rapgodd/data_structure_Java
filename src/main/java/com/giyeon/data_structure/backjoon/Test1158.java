package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Test1158 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] nk = br.readLine().split(" ");

        int peopleAmount = Integer.parseInt(nk[0]);
        int removeWhenReachThisNum = Integer.parseInt(nk[1]);

        //사람들이 제거되었는지 안 제거되었는지 T/F로 표시하는 배열 생성
        boolean[] removedOrNot = new boolean[peopleAmount];
        sb.append("<");
        removePeople(removedOrNot, sb,peopleAmount,removeWhenReachThisNum);
        sb.append(">");

        String answer = sb.toString();
        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();
    }

    private static void removePeople(boolean[] removedOrNot, StringBuilder sb, int peopleAmount, int removeWhenReachThisNum) {

        int countNotRemovedNum = 0;
        int loopAmount = 0;
        int appendCount = 0;

        int stopNumber = peopleAmount * removeWhenReachThisNum;

        while (loopAmount < stopNumber){

            for(int i = 0; i<peopleAmount; i++){

                if(removedOrNot[i]==false){
                    countNotRemovedNum += 1;
                    loopAmount += 1;
                }else{
                    loopAmount += 1;
                }

                if(removeWhenReachThisNum==countNotRemovedNum){
                    if(appendCount==peopleAmount-1){
                        sb.append(i+1);
                        return;
                    }else{
                        sb.append(i+1 + ", ");
                        appendCount += 1;
                    }
                    countNotRemovedNum = 0;
                    loopAmount = 0;
                    removedOrNot[i] = true;
                }

            }

        }

    }

}
