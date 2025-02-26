package com.giyeon.data_structure.backjoon.implementation;

import java.io.*;

public class Q2740 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String strNM = br.readLine();
        String[] splitNM = strNM.split(" ");

        int n = Integer.parseInt(splitNM[0]);
        int m = Integer.parseInt(splitNM[1]);

        int[][] arr1 = new int[n][m];
        fillArr(n, br, m, arr1);
        
        String strMK = br.readLine();
        String[] splitMK = strMK.split(" ");
        
        int k = Integer.parseInt(splitMK[1]);
        int[][] arr2 = new int[m][k];
        fillArr(m, br, k, arr2);
        
        
        for(int i =0; i<n; i++){
            int[][] temp = new int[m][k];
            for(int j = 0; j<m; j++){

                saveTemporary(k, j, arr2, temp, arr1[i]);

                fillSb(j, m, k, temp, sb);

            }

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

    private static void saveTemporary(int k, int j, int[][] arr2, int[][] temp, int[] arr1) {
        for(int w = 0; w< k; w++){
            int result = arr1[j] * arr2[j][w];
            temp[j][w] += result;
        }
    }

    private static void fillSb(int j, int m, int k, int[][] temp, StringBuilder sb) {
        int y;
        if(j == m -1){
            for(int q = 0; q< k; q++){
                y = 0;
                for(int z = 0; z< m; z++){
                    y += temp[z][q];
                }
                sb.append(y+" ");
            }
            sb.append("\n");
        }
    }

    private static void fillArr(int n, BufferedReader br, int m, int[][] arr1) throws IOException {
        for(int i = 0; i< n; i++){
            String[] components = br.readLine().split(" ");
            for(int j = 0; j< m; j++){
                arr1[i][j] = Integer.parseInt(components[j]);
            }
        }
    }

}
