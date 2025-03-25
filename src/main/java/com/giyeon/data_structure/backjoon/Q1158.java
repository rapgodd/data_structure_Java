package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q1158 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split(" ");
        int capacity = Integer.parseInt(arr[0]);
        int removeCount = Integer.parseInt(arr[1]);
        int cursor = 0;

        ArrayList<Integer> arrList = new ArrayList<>(capacity);
        for(int i = 1; i<=capacity; i++){
            arrList.add(i);
        }

        sb.append("<");
        while(arrList.size()>1){
            cursor += removeCount - 1;

            if(cursor >= arrList.size()){
                cursor = cursor%arrList.size();
                sb.append(arrList.remove(cursor)+", ");
            }else{
                sb.append(arrList.remove(cursor)+", ");
            }
        }
        sb.append(arrList.remove(0)+">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }


}
