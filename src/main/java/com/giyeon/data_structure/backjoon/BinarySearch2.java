package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class BinarySearch2 {

    public static int wifiNumCount = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String houseAndWifiNum = br.readLine();
        String[] houseAndWifiList = houseAndWifiNum.split(" ");
        int houseNum = Integer.parseInt(houseAndWifiList[0]);
        int wifiNum = Integer.parseInt(houseAndWifiList[1]);

        ArrayList<Integer> houseLocations = new ArrayList<>();

        for (int i = 0; i < houseNum; i++) {
            int houseLocation = Integer.parseInt(br.readLine());
            houseLocations.add(houseLocation);
        }

        Collections.sort(houseLocations);
        int longestDistanceOfWifi = findLongestDistanceOfWifi(houseLocations, houseNum, wifiNum);
        String stringLongestDistanceOfWifi = String.valueOf(longestDistanceOfWifi);
        bw.write(stringLongestDistanceOfWifi);

        bw.flush();
        bw.close();
        br.close();

    }

    private static int findLongestDistanceOfWifi(ArrayList<Integer> houseLocations, int houseNum, int wifiNum){
        //wifi 범위 결정
        //처음 리스트 값, 마지막 리스트 값을 wifi범위로 결정
        //mid값으로 했을때 wifi 몇개 나오는지 counting
        //크면 low = mid + 1로 작으면 high = mid - 1
        //같으면 low값 mid로 바꿔서 다시 실행
        //low랑 high랑 같을때까지 계속 한다.

        int wifiMinimumDistance = 1;
        int wifiMaximumDistance = houseLocations.get(houseNum-1);

        while(wifiMinimumDistance!=wifiMaximumDistance+1){
            wifiNumCount = 1;
            int beforeWifiLocation = houseLocations.get(0);
            int midValueOfWifiDistanceRange = (wifiMaximumDistance + wifiMinimumDistance) / 2;

            for(int i = 1; i< houseNum; i++){
                if(houseLocations.get(i)-beforeWifiLocation >= midValueOfWifiDistanceRange){
                    wifiNumCount++;
                    beforeWifiLocation = houseLocations.get(i);
                }
            }

            if(wifiNumCount>=wifiNum){
                wifiMinimumDistance = midValueOfWifiDistanceRange + 1;
            }else if(wifiNumCount<wifiNum){
                wifiMaximumDistance = midValueOfWifiDistanceRange - 1;
            }
        }

        return wifiMaximumDistance;
    }

}
