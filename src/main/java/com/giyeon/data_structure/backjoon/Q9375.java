package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Q9375 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int testCaseNum = Integer.parseInt(br.readLine());

        for(int i =0; i<testCaseNum; i++){
            HashMap<String, List<String>> map = new HashMap<>();
            int clothCount = Integer.parseInt(br.readLine());
            // key : 옷 종류 , value : 옷 이름
            for(int j=0; j<clothCount; j++){

                StringTokenizer st = new StringTokenizer(br.readLine());
                String clothName = st.nextToken();
                String clothKind = st.nextToken();

                if(map.containsKey(clothKind)){
                    List<String> list = map.get(clothKind);
                    list.add(clothName);
                }else{
                    ArrayList<String> initList = new ArrayList<>();
                    initList.add(clothName);
                    map.put(clothKind, initList);
                }

            }

            int answer = 1;
            for(List<String> list : map.values()){
                answer *= (list.size() + 1);
            }
            answer  = answer - 1;
            sb.append(answer).append("\n");

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }



}
