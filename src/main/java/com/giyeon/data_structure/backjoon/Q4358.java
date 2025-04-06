package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Q4358 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Double> hashMap = new HashMap<>();

        double totalCount = 0;

        //HashMap에 Tree의 이름을 key로 Tree의 총 수를 value로 집어 넣었다.
        String tree;
        while ((tree = br.readLine()) != null) {

            if(hashMap.containsKey(tree)){
                double count = hashMap.get(tree);
                hashMap.put(tree, count+1);
                totalCount = totalCount+1;
            }else{
                hashMap.put(tree,1.0);
                totalCount = totalCount+1;
            }
        }

        Set<String> treeSet = hashMap.keySet();
        String[] treeArr = treeSet.toArray(new String[treeSet.size()]);
        Arrays.sort(treeArr);

        for(int i=0; i<treeArr.length; i++){
            String treeName = treeArr[i];
            double treeCount = hashMap.get(treeName);
            Double ratio = (treeCount/totalCount)*100;
            String answer = String.format("%.4f",ratio);
            sb.append(treeName+" "+answer+"\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();



    }


}
