package com.giyeon.data_structure.backjoon.implementation;

public class BinaryMethod {

    public int solution(int n){
        Integer integerN = n;
        int result = 0;
        Integer oneAmount = 0;
        oneAmount = countOne(integerN);

        while(true){
            Integer oneOfN = oneAmount;
            integerN = integerN+1;
            Integer oneSize = countOne(integerN);
            if(oneOfN.equals(oneSize)){
                result = integerN;
                break;
            }
        }

        return result;
    }

    public Integer countOne(Integer n){
        String binary = n.toBinaryString(n);
        String[] binArr = binary.split("");
        Integer oneAmount = 0;

        for(String bin : binArr){
            if(bin.equals("1")){
                oneAmount+=1;
            }
        }

        return oneAmount;

    }



}
