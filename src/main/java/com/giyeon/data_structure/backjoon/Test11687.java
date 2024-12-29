package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Test11687 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //배열에 팩토리얼 규칙 담기
        int[] minimumFactoryNumOfZeroIndex = new int[1000000001];

        int loopNum = 4;
        int currentLoop = 0;

        for(int i =1; i<1000000001; i++){

            //-1이 나와야 하는 인덱스가 나오지 않으면 -> 5*i를 0개수의 최소 팩토리얼 숫자로 넣는다
            if(currentLoop!=loopNum){
                currentLoop += 1;
                minimumFactoryNumOfZeroIndex[i] = 5 * i;
            }else{//-1이 나와야 하는 인덱스가 나오면 -> currentLoop 초기화하고 loopNum+1한다.
                currentLoop = 0;
                loopNum += 1;
                minimumFactoryNumOfZeroIndex[i] = -1;
            }
        }

        int result = minimumFactoryNumOfZeroIndex[Integer.parseInt(br.readLine())];
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();

    }

}
