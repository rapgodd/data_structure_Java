package com.giyeon.data_structure.backjoon;

import java.io.*;

public class UnionFind {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String NAndM = br.readLine();
        String[] split = NAndM.split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        int[] arr = new int[n+1];//0부터 인덱스가 n까지 있는 배열을 생성한다.

        //0~n까지의 인덱스에 0~n 까지의 값이 들어가 있다.
        for(int i = 0; i < n+1; i++) {
            arr[i] = i;
        }

        //주어진 명령과 값 두개를 보면서 경우에 따라 연산을 수행한다.
        for (int i = 0; i < m; i++) {
            String calculation = br.readLine();
            String[] commandAndNum = calculation.split(" ");
            int command = Integer.parseInt(commandAndNum[0]);
            int a = Integer.parseInt(commandAndNum[1]);
            int b = Integer.parseInt(commandAndNum[2]);

            if (command == 0) {
                if(a<b){
                    for (int j = 0; j < arr.length; j++) {
                        if(arr[j]==b){
                            arr[j] = a;
                        }
                    }
                }else if(a>b){
                    for (int j = 0; j < arr.length; j++) {
                        if(arr[j]==a){
                            arr[j] = b;
                        }
                    }
                }else{

                }

            }else {//1인경우
                if (arr[a] == arr[b]) {
                    bw.write("YES\n");
                }else {
                    bw.write("NO\n");
                }
            }

        }
        bw.flush();

        br.close();
        bw.close();
    }
}
