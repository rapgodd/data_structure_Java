package com.giyeon.data_structure.backjoon.implementation;

public class FinalBinary {


        public int solution(int n){
            int num = n+1;
            //주이진 수 비트 1의 개수를 반환한다.
            int oneOfN = Integer.bitCount(n);
            int result = 0;
            //n+1 씩 하면서 1 수 같은거 바로 출력
            while(true){

                if(Integer.bitCount(num)==oneOfN){
                    result = num;
                    break;
                }
                num++; // 1씩 증가
            }
            return result;
        }

}
