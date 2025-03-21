package com.giyeon.data_structure.backjoon.implementation;

public class Remain {
    public int solution(int n) {

        int[] intArr = new int[n+1];

        intArr[0] = 0;
        intArr[1] = 1;

        for(int i = 2; i<n+1; i++){
            intArr[i] = (intArr[i-1]+intArr[i-2])%1234567;
        }

        return intArr[n];
    }
}
