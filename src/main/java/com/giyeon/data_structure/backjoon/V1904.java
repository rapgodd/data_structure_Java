package com.giyeon.data_structure.backjoon;


import java.io.*;

public class V1904 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int totalCase = 0;

        if(n%2==0){
            for(int i=0; i <= n/2; i++){
                int combinationNum = getCombinationNum(n / 2, i);
                totalCase += combinationNum;
            }

            for(int i=1; i <= n/2-1; i++) {
                int combinationNum = getCombinationNum((n / 2)-1, i);
                totalCase += combinationNum;
            }
            int result = totalCase % 15746;
            sb.append(result);
            bw.write(sb.toString());
            bw.flush();
            bw.close();
            br.close();

        }else{
            for(int i=0; i <= (n-1)/2; i++){
                int combinationNum = getCombinationNum(n / 2, i);
                totalCase += combinationNum;
            }
            totalCase = (totalCase*2);
            totalCase = totalCase -1;
            int result = totalCase % 15746;
            sb.append(result);
            bw.write(sb.toString());
            bw.flush();
            bw.close();
            br.close();
        }


    }

    private static int getCombinationNum(int n, int r){
        if(n==r||r==0){
            return 1;
        }else{
            return getCombinationNum(n-1, r-1)+getCombinationNum(n-1, r);
        }
    }

}
