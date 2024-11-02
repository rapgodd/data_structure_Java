package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class CuttingTree2805 {

    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] treeAmountAndCuttingLength = br.readLine().split(" ");
        int treeAmount = Integer.parseInt(treeAmountAndCuttingLength[0]);
        int cuttingLength = Integer.parseInt(treeAmountAndCuttingLength[1]);

        //나무 길이 받아와서 Array에 집어 넣기
        ArrayList<Integer> treeLengthArray  = new ArrayList<>();
        int tallestTreeLength = getEachTreeAndReturnTallestTreeLength(treeAmount, br, treeLengthArray);

        //최소 정한 후에 이진탐색 시작
        int low = 0;
        int result = binarySearchToGetCutterHigh(tallestTreeLength, low, treeLengthArray, cuttingLength);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int binarySearchToGetCutterHigh(int tallestTreeLength, int low, ArrayList<Integer> treeLengthArray,int requiredCuttingLength) {
        int mid = (tallestTreeLength + low) / 2;
        long cuttedTreeLengthSum = 0;
        for(int treeLength : treeLengthArray){
            if(treeLength - mid> 0){
                cuttedTreeLengthSum = cuttedTreeLengthSum + treeLength - mid;
            }
        }

        if(cuttedTreeLengthSum > requiredCuttingLength){
            low = mid + 1;
            return binarySearchToGetCutterHigh(tallestTreeLength, low, treeLengthArray,requiredCuttingLength);
        }else if(cuttedTreeLengthSum < requiredCuttingLength){
            tallestTreeLength = mid - 1;
            return binarySearchToGetCutterHigh(tallestTreeLength, low, treeLengthArray,requiredCuttingLength);
        }else{
            return mid;
        }

    }

    private static int getEachTreeAndReturnTallestTreeLength(int treeAmount, BufferedReader br, ArrayList<Integer> treeLengthArray) throws IOException{
        String treeLength = br.readLine();
        String[] split = treeLength.split(" ");

        for(int i = 0; i < split.length; i++){
            treeLengthArray.add(Integer.parseInt(split[i]));
        }
        Collections.sort(treeLengthArray);
        return treeLengthArray.get(treeLengthArray.size() - 1);
    }

}
