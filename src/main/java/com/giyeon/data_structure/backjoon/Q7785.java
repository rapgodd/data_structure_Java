package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class Q7785 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int logCount = Integer.parseInt(br.readLine());
        HashMap<String,String> logMap = new HashMap<>(logCount);
        for(int i =0; i<logCount; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String log = st.nextToken();
            logMap.put(name,log);
        }

        List<String> nameList = new ArrayList<>(logCount);
        Set<String> nameSet = logMap.keySet();
        for(String name : nameSet){

            if(logMap.get(name).equals("enter")){
                nameList.add(name);
            }

        }

        Collections.sort(nameList);
        int listSize = nameList.size();

        for(int i = listSize-1; i>=0; i--){
            sb.append(nameList.get(i)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
