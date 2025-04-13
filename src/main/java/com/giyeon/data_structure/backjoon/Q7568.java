package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Q7568 {
    //int[몸무게,키,br에서 등장한 순서(출력 순서),얘보다 덩치큰 사람 수]
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        int[][] arrs = new int[total][4];
        for(int i =1; i<=total; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            int outputSequence = i;
            arrs[i-1] = new int[]{weight, height, outputSequence, 1};

        }

        Comparator<int[]> com = (a,b)->{
          if(a[0]>b[0]){
              return 1;
          }else{
              return -1;
          }
        };

        Arrays.sort(arrs, com);

        int[] resultArr = new int[total];
        for(int i=0; i<total; i++){

            for(int j=i+1; j<total; j++){
                if(arrs[i][1]<arrs[j][1]&&arrs[i][0]<arrs[j][0]){
                    arrs[i][3] += 1;
                }
            }
            resultArr[arrs[i][2] - 1] = arrs[i][3];

        }

        for(int component : resultArr){
            sb.append(component + " ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
