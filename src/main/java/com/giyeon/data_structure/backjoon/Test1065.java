package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Test1065 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int givenNumber = Integer.parseInt(br.readLine());
        int answerCount;

        if(givenNumber<100){
            answerCount = givenNumber;
            bw.write(String.valueOf(answerCount));
            bw.flush();
            bw.close();
            br.close();
        }else{
            answerCount = 99;
            for(int i = 100; i<=givenNumber; i++){
                if(getIfTheNumIsEqualNum(givenNumber,answerCount,i)==true){
                    answerCount++;
                }
            }
            bw.write(String.valueOf(answerCount));
            bw.flush();
            bw.close();
            br.close();
        }


    }

    private static boolean getIfTheNumIsEqualNum(int givenNumber, int answerCount,int i) throws IOException{
        String loopedGivenNumberStringVer = String.valueOf(i);
        String[] loopedGivenNumberStringArrVer= loopedGivenNumberStringVer.split("");
        int diff = Integer.parseInt(loopedGivenNumberStringArrVer[1]) - Integer.parseInt(loopedGivenNumberStringArrVer[0]);

        if((Integer.parseInt(loopedGivenNumberStringArrVer[2])-Integer.parseInt(loopedGivenNumberStringArrVer[1]))==diff){
            return true;
        }
        return false;
    }


}
