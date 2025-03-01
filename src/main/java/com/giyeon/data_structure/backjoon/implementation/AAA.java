package com.giyeon.data_structure.backjoon.implementation;


// 자바에서 " / " : 나누기(결과 반환)
// 정수/정수 -> 나누기 결과가 실수이더라도(5/2 = 2.5) 정수(2)를 반환한다.
// 두 수중 하나라도 실수 -> 무조건 실수 반환을 한다.(결과가 정수이어도 실수 반환 1->1.0)
public class AAA {

    public static void main(String[] args){

        int a = 132;
        int sum = 0;

        while(a>0){
            int rest = a % 10;
            sum += rest;
            a /= 10;
        }

        System.out.println(sum);

    }
}
