package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Combination {
    private static int[] locationHouse;
    private static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] countHouseAndWifi = br.readLine().split(" ");
        int houseNum = Integer.parseInt(countHouseAndWifi[0]);
        int wifiNum = Integer.parseInt(countHouseAndWifi[1]);
        locationHouse = new int[houseNum];

        for (int i = 0; i < houseNum; i++) {
            locationHouse[i] = Integer.parseInt(br.readLine());
        }

        getCombination(houseNum, wifiNum, 0, new ArrayList<>());

        ArrayList<Integer> saveDifferences = new ArrayList<>();
        int minimumDifferences = 0;
        for (ArrayList<Integer> integers : list) {
            Collections.reverse(integers);
            for (int i = 0; i < integers.size()-1; i++) {
                if(integers.get(i)-integers.get(i+1)>minimumDifferences & i<= integers.size()-2){
                    minimumDifferences = integers.get(i) - integers.get(i + 1);
                }
                if(i==integers.size()-1){
                    saveDifferences.add(minimumDifferences);
                    minimumDifferences = 0;
                    break;
                }
            }
        }

        Collections.sort(saveDifferences);
        Integer last = saveDifferences.get(saveDifferences.size()-1);
        bw.write(String.valueOf(last));
        bw.flush();
        bw.close();
        br.close();
    }

    private static void getCombination(int houseNum, int wifiNum, int i, ArrayList<Integer> blankArray) {
        if (i == wifiNum) {
            list.add(blankArray);
            return;
        }

        for (int j = i; j < houseNum; j++) {
            blankArray.add(locationHouse[j]);
            getCombination(houseNum, wifiNum, j + 1, blankArray);
            blankArray.remove(blankArray.size() - 1);
        }


    }
}
