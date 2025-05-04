package com.giyeon.data_structure.backjoon;

import java.io.*;

public class Q2775 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i<testCase; i++){

            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            int[][] arr = new int[K+1][N+1];

            for(int j = 1; j<=N; j++){

                arr[0][j] = j;

            }

            for(int w = 1; w<K; w++){

                for(int q=1; q<=N; q++){

                    int result=0;
                    for(int s=1; s<=q; s++){

                        result += arr[w-1][s];

                    }
                    arr[w][q] = result;


                }

            }

            int result = 0;
            for(int g=1; g<=N; g++){

                result += arr[K - 1][g];


            }
            sb.append(result).append("\n");

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
