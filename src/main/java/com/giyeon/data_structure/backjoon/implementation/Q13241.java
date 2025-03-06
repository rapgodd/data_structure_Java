package com.giyeon.data_structure.backjoon.implementation;

import java.util.*;
import java.io.*;

public class Q13241 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Long, Integer> hmF = new HashMap<>();
        HashMap<Long, Integer> hmS = new HashMap<>();

        String[] stringArr = br.readLine().split(" ");
        long firstNum = Integer.parseInt(stringArr[0]);
        long secondNum = Integer.parseInt(stringArr[1]);

        long remainedNumF = setMap(firstNum,hmF);
        long remainedNumS = setMap(secondNum,hmS);
        lastAdd(remainedNumF,hmF);
        lastAdd(remainedNumS,hmS);

        //공배수 원소들 모으기
        long result = getResult(hmF,hmS);

        bw.write(Long.toString(result));

        bw.flush();
        bw.close();
        br.close();

    }

    private static long getResult(HashMap<Long, Integer> hmF, HashMap<Long, Integer> hmS) {
        long result = 1;

        Set<Long> keySetF = hmF.keySet();
        for(long a : keySetF){
            if(hmS.containsKey(a)){
                if(hmF.get(a)>=hmS.get(a)){
                    hmS.put(a, 0);
                }else{
                    hmS.put(a, hmS.get(a)-hmF.get(a));
                }

                for(long i=0; i<hmF.get(a);i++){
                    result *= a;
                }

            }else{
                for(long i=0; i<hmF.get(a);i++){
                    result *= a;
                }
            }
        }


        //두번째 set
        Set<Long> keySet = hmS.keySet();
        for(long a : keySet){
                for(long i=0; i<hmS.get(a);i++){
                    result *= a;
                }
        }

        return result;
    }

    private static long setMap(long num, HashMap<Long,Integer> hm){

        for(long i = 2; i<num; i++){

            if(num%i==0){
                if (hm.get(i) != null) {
                    int a = hm.get(i);
                    hm.put(i, a + 1);
                    num = num / i;
                    num = setMap(num, hm);
                    break;
                }else{
                    hm.put(i, 1);
                    num = num / i;
                    num = setMap(num, hm);
                    break;
                }
            }
        }

        return num;



    }

    private static void lastAdd(long remainedNum, HashMap<Long,Integer> hm){

        if(hm.get(remainedNum)!=null){
            hm.put(remainedNum, hm.get(remainedNum) + 1);
        }else{
            hm.put(remainedNum, 1);
        }

    }



}
