package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class FriendNetwork {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //전체 케이스 수
        int initialNumber = Integer.parseInt(br.readLine());


        for (int i = 0; i < initialNumber; i++) {
            //각각 케이스의 친구 관계 수
            int friendshipCases = Integer.parseInt(br.readLine());

            HashMap<String, Integer> friendshipMap = new HashMap<>();
            Integer count = 0;

            HashMap<Integer,Integer> countForPrint = new HashMap<>();
            for (int j = 0; j < friendshipCases; j++) {

                String friendship = br.readLine();
                String[] split = friendship.split(" ");
                String friend1 = split[0];
                String friend2 = split[1];

                //두개다 이미 맵에 있는 경우
                if (friendshipMap.containsKey(friend1) && friendshipMap.containsKey(friend2)) {
                    Integer value1 = friendshipMap.get(friend1);
                    Integer value2 = friendshipMap.get(friend2);

                    //값이 다른 경우
                    //작은 값으로 부모를 다 바꾼다
                    if(!value1.equals(value2)){
                        if(value1 > value2){
                            for (Map.Entry<String, Integer> stringIntegerEntry : friendshipMap.entrySet()) {
                                if(stringIntegerEntry.getValue().equals(value1)){
                                    stringIntegerEntry.setValue(value2);
                                    countForPrint.put(value2, countForPrint.getOrDefault(value2, 0) + 1);
                                    countForPrint.put(value1, countForPrint.getOrDefault(value1, 0) - 1);
                                }
                            }
                        }else {
                            for (Map.Entry<String, Integer> stringIntegerEntry : friendshipMap.entrySet()) {
                                if(stringIntegerEntry.getValue().equals(value2)){
                                    stringIntegerEntry.setValue(value1);
                                    countForPrint.put(value1, countForPrint.getOrDefault(value1, 0) + 1);
                                    countForPrint.put(value2, countForPrint.getOrDefault(value2, 0) - 1);
                                }
                            }
                        }
                    }
                }else if(friendshipMap.containsKey(friend1)&&!friendshipMap.containsKey(friend2)) {
                    Integer integer = friendshipMap.get(friend1);
                    friendshipMap.put(friend2, integer);
                    countForPrint.put(integer,countForPrint.getOrDefault(integer,0) + 1);
                }else if (!friendshipMap.containsKey(friend1)&&friendshipMap.containsKey(friend2)) {
                    Integer integer = friendshipMap.get(friend2);
                    friendshipMap.put(friend1, integer);
                    countForPrint.put(integer,countForPrint.getOrDefault(integer,0) + 1);
                }else {
                    friendshipMap.put(friend1, count);
                    friendshipMap.put(friend2, count);
                    countForPrint.put(count,countForPrint.getOrDefault(count,0) + 2);
                    count++;
                }
                String networkNumber = findNetworkNumber(countForPrint);
                bw.write(networkNumber+"\n");
            }
        }

        bw.flush();

        br.close();
        bw.close();


    }

    private static String findNetworkNumber(HashMap<Integer,Integer> countForPrint) {
        Set<Integer> keys = countForPrint.keySet();
        int biggestNumOfValues = 0;
        for (Integer key : keys) {
            Integer numOfKeys = countForPrint.get(key);
            if(numOfKeys > biggestNumOfValues){
                biggestNumOfValues = numOfKeys;
            }
        }
        return String.valueOf(biggestNumOfValues);
    }
}
