package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

/**
 * Depth == 커스텀 배열의 인덱스
 *
 * 그리고 내가 여기에 집어 넣어야 하는 값은 이전 depth loop의
 * arr[i]값보다 적어도 1 큰 i값을 넣어야 한다.
 */
public class Q15664 {

    public static Set<String> isExisted = new HashSet<>();
    public static int[] arr;
    public static int[] customArr;
    public static int arrSize;
    public static int numAmount;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        numAmount = Integer.parseInt(st.nextToken());
        arrSize = Integer.parseInt(st.nextToken());
        customArr = new int[arrSize+1];

        arr = new int[numAmount+1];

        //배열에 주어진 수를 집어넣자
        StringTokenizer arrTokens = new StringTokenizer(br.readLine());
        for(int i =1; i<=numAmount; i++){
           arr[i] = Integer.parseInt(arrTokens.nextToken());
        }

        Arrays.sort(arr);

        backTracking(1,1,sb);

        //결과 출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static void backTracking(int start,int depth,StringBuilder sb) {

        if(depth==arrSize+1){
            // 생성한 수열이 이전에 만들었던 수열이라면
            if(isExisted.contains(Arrays.toString(customArr))){
                return;
            }else{
                isExisted.add(Arrays.toString(customArr));

                for(int i=1; i<=arrSize; i++){
                    sb.append(customArr[i] + " ");
                }
                sb.append("\n");
                return;

            }
        }

        // 전체 주어진 수를 바탕으로 수열을 생성하는 루프
        for(int i=start; i<=numAmount; i++){
            customArr[depth] = arr[i];
            int newDepth = depth + 1;
            backTracking(i+1,newDepth,sb);
        }

    }

}
