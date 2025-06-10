package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class BJ21736 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[][] map = new String[n][m];
        boolean[][] visitedMap = new boolean[n][m];
        int[] iLoc = new int[2];
        int count = 0;

        for (int i = 0; i < n; i++) {

            String line = br.readLine();
            char[] lineArr = line.toCharArray();

            for(int j=0; j<m; j++){
                String a = String.valueOf(lineArr[j]);
                map[i][j] = a;
                if(a.equals("I")){
                    iLoc[0] = i;
                    iLoc[1] = j;
                    visitedMap[i][j] = true;

                }
            }

        }

        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.offerFirst(iLoc);

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};


        while (!queue.isEmpty()) {
            int[] locArr = queue.pollLast();

            int y = locArr[0];
            int x = locArr[1];

            for(int i=0; i<4; i++){
                int newX = x + dx[i];
                int newY = y + dy[i];
                int[] arr = new int[]{newY,newX};

                if(newX>=0 && newY>=0 && newX<m && newY<n){

                    if(!visitedMap[newY][newX] && !map[newY][newX].equals("X")){
                        queue.offerFirst(arr);
                        visitedMap[newY][newX] = true;
                        if (map[newY][newX].equals("P")){
                            count++;
                        }
                    }

                }

            }

        }

        if (count == 0) {
            bw.write("TT");
            bw.flush();
            bw.close();
            br.close();
        }else{
            bw.write(String.valueOf(count));
            bw.flush();
            bw.close();
            br.close();
        }

    }

}
