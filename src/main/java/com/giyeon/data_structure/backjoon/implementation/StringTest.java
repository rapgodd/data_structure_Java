package com.giyeon.data_structure.backjoon.implementation;

import java.util.Arrays;

public class StringTest {

    public String solutionV1(String s) {

        String[] sArr = s.split("");
        boolean emptyFlag = true;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<sArr.length; i++){
            if(emptyFlag==true&&!sArr[i].equals(" ")){
                sArr[i] = sArr[i].toUpperCase();
                emptyFlag = false;
            }else if(emptyFlag==false && sArr[i].equals(" ")){
                emptyFlag = true;
            }else if(emptyFlag==false && !sArr[i].equals(" ")){
                sArr[i] = sArr[i].toLowerCase();
            }
        }

        for(int i = 0; i<sArr.length; i++){
            sb.append(sArr[i]);
        }

        String answer = sb.toString();
        return answer;


    }


    public String solutionV2(String s) {

        String[] sArr = s.split("");
        boolean emptyFlag = true;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<sArr.length; i++){
            if(emptyFlag==true&&!sArr[i].equals(" ")){
                sb.append(sArr[i].toUpperCase());
                emptyFlag = false;
            }else if(emptyFlag==false && sArr[i].equals(" ")){
                sb.append(sArr[i]);
                emptyFlag = true;
            }else if(emptyFlag==false && !sArr[i].equals(" ")){
                sb.append(sArr[i].toLowerCase());
            }else{
                sb.append(sArr[i]);
            }
        }

        String answer = sb.toString();
        return answer;

    }



}
