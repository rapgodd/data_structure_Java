package com.giyeon.data_structure.backjoon.implementation;

import java.io.*;

public class Q1057 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] survivedOrNot = new boolean[100001];
        int matchRound = 1;
        int count = 0;
        boolean ifMatched = false;
        int previousIndex = 0;

        for(int i=0; i<survivedOrNot.length; i++){
            survivedOrNot[i] = true;
        }

        String[] conditions = br.readLine().split(" ");
        int N = Integer.parseInt(conditions[0]);
        int mrKim = Integer.parseInt(conditions[1]);
        int mrHan = Integer.parseInt(conditions[2]);

        matchRound = getMatchRound(ifMatched, count, N, survivedOrNot, mrKim, mrHan, previousIndex, matchRound);

        bw.write(String.valueOf(matchRound));
        bw.flush();
        bw.close();
        br.close();

    }

    private static int getMatchRound(boolean ifMatched, int count, int N, boolean[] survivedOrNot, int mrKim, int mrHan, int previousIndex, int matchRound) {
        while(!ifMatched){
            if(count !=0){
                count = 0;
            }
            for(int i = 1; i<= N; i++){

                if(survivedOrNot[i]){
                    if(count ==0){
                        count += 1;
                    }else{
                        if(i== mrKim | i== mrHan){
                          if(previousIndex == mrKim | previousIndex == mrHan){
                              ifMatched = true;
                              break;
                          }else{
                              survivedOrNot[previousIndex] = false;
                              count = 0;
                          }
                        }else{
                            survivedOrNot[i] = false;
                            count = 0;
                        }

                    }
                    previousIndex = i;
                }
            }
            if(ifMatched){
                break;
            }else{
                matchRound += 1;
            }
        }
        return matchRound;
    }

}
