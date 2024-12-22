package com.giyeon.data_structure.backjoon;

import java.io.*;

public class BJ1495 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");

        int numOfSong = Integer.parseInt(arr[0]);
        int initVolume = Integer.parseInt(arr[1]);
        int maxVolume = Integer.parseInt(arr[2]);

        String[] volumeDiff = br.readLine().split(" ");

        boolean[][] dp = new boolean[numOfSong+1][maxVolume+1];
        filldp(numOfSong,maxVolume,initVolume,dp,volumeDiff);

        //n번째 곡을 부르기 전 가장 큰 볼륨이 뭐였는지 찾고 바로 반복문 빠져 나오기
        for(int m = maxVolume; m>=0; m--){
            if(dp[numOfSong][m]){
                sb.append(m);
                break;
            }
            if(m==0&&dp[numOfSong][0]==false){
                sb.append(-1);
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static void filldp(int numOfSong, int maxVolume, int initVolume, boolean[][] dp, String[] volumeDiff) throws IOException{

        //dp[i][j] i번째 곡을 연주하기 전 j볼륨을 맞출 수 있는지

        //시작 볼륨 부분 true로 설정
        dp[0][initVolume] = true;

        //반복문 돌리기
        for(int i =1; i<=numOfSong; i++){
            for(int j =0; j<= maxVolume; j++){
                if(dp[i-1][j]==true){
                    int diff = Integer.parseInt(volumeDiff[i - 1]);
                    if(0 <= j + diff && j + diff <= maxVolume){
                        dp[i][j+diff] = true;
                    }
                    if(0 <= j - diff && j - diff <= maxVolume) {
                        dp[i][j - diff] = true;
                    }
                }
            }
        }
    }


}
