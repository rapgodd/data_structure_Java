package com.giyeon.data_structure.backjoon.dfsBackJoon;

import java.io.*;

public class test2563 {

    public static int a = 0;

    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        boolean[][] map = new boolean[100][100];

        int dupCount = 0;
        for(int i = 0; i < loop; i++){

            String[] colAndRow = br.readLine().split(" ");
            int col = Integer.parseInt(colAndRow[0]);
            int row = Integer.parseInt(colAndRow[1]);

            for(int j = col; j<=col+9; j++){
                for(int k = 90-row; k<=99-row; k++){
                    if(!map[k][j]){
                        map[k][j] = true;
                    }else{
                        dupCount += 1;
                    }
                }
            }
        }
        int recTotalWidth = 100 * loop;
        int answer = recTotalWidth - dupCount;
        bw.write(String.valueOf(answer) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}
