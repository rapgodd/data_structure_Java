package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q9625 {

    public static void main(String[] args) throws IOException{

        // br, bw, sb
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        // k값을 읽어온다
        int k = Integer.parseInt(br.readLine());

        // 배열 2개 생성 [46]
        int[] aArr = new int[46];
        int[] bArr = new int[46];

        // 배열에 초기 값을 집어 넣는다 k=1,2
        aArr[1] = 0;
        aArr[2] = 1;
        bArr[1] = 1;
        bArr[2] = 1;

        // k값까지 루프를 돌면서 a의 수와 b의 수를 구한다.
        if(k<3){
            sb.append(aArr[k]).append(" ").append(bArr[k]);
            String result = sb.toString();
            bw.write(result);
            bw.flush();
            bw.close();
            br.close();
        }else{
            for(int i = 3; i<=k; i++){
                aArr[i] = aArr[i - 1] + aArr[i - 2];
                bArr[i] = bArr[i - 1] + bArr[i - 2];
            }

            sb.append(aArr[k]).append(" ").append(bArr[k]);
            String result = sb.toString();
            bw.write(result);
            bw.flush();
            bw.close();
            br.close();
        }

    }

}
