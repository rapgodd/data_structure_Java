package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;

public class BJ15686 {

    static PriorityQueue<Integer> chickenStreetDistance = new PriorityQueue<>();
    static List<ArrayList<Integer>> houseList = new ArrayList<>();
    static List<ArrayList<Integer>> chickenList = new ArrayList<>();


    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String a = br.readLine();
        String[] nAndM = a.split(" ");

        int n = Integer.parseInt(nAndM[0]);
        int m = Integer.parseInt(nAndM[1]);

        //이차원 배열 생성후 값들 집어넣기
        int[][] map = new int[n][n];

        fillMap(map,br,n,houseList,chickenList);

        int size = chickenList.size();
        boolean[] visited = new boolean[size];

        //치킨집들중 m개만 선택해서 그것들과 집들간의 최소 거리를 구한다.
        getChickenStreetDistance(m,0,0,visited);

        sb.append(chickenStreetDistance.poll());
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }


    private static void getChickenStreetDistance(int m
                                                , int chosenCount
                                                , int visitedIndex
                                                , boolean[] visited){

        if(m == chosenCount){
            getChickenDistanceSum(visited,visited.length,m);
            return;
        }


        if (visitedIndex == visited.length) {
            return;
        }

        //visitedIndex번째 선택
        visited[visitedIndex] = true;
        getChickenStreetDistance(m,chosenCount+1, visitedIndex+1,visited);

        //visitedIndex번째 선택X
        visited[visitedIndex] = false;
        getChickenStreetDistance(m,chosenCount, visitedIndex+1,visited);


    }

    private static void getChickenDistanceSum(boolean[] visited, int visitedLen, int m){
        int result = 0;
        ArrayList<Integer> chosenChickenHouseIndexArr = new ArrayList<>();

        for(int i =0; i<visitedLen; i++){
            if(visited[i]==true){
                chosenChickenHouseIndexArr.add(i);
            }
        }

        for(int j=0; j<houseList.size(); j++){
            int minDistanceFromHouseToChickenHouse = 0;

            ArrayList<Integer> house = houseList.get(j);
            int houseR = house.get(0);
            int houseC = house.get(1);


                for (int index : chosenChickenHouseIndexArr) {
                    ArrayList<Integer> chickenHouse = chickenList.get(index);
                    int distance = Math.abs(houseR - chickenHouse.get(0)) + Math.abs(houseC - chickenHouse.get(1));

                    if(minDistanceFromHouseToChickenHouse==0){
                        minDistanceFromHouseToChickenHouse = distance;
                    }else{
                        if(distance<minDistanceFromHouseToChickenHouse){
                            minDistanceFromHouseToChickenHouse = distance;
                        }
                    }
                }
            result += minDistanceFromHouseToChickenHouse;
        }
        chickenStreetDistance.offer(result);
    }



    private static void fillMap(int[][] map, BufferedReader br
                                ,int n
                                 ,List<ArrayList<Integer>> houseList
                                   ,List<ArrayList<Integer>> chickenList) throws IOException{

        for(int i = 0; i<n; i++){
            String line = br.readLine();
            String[] arr = line.split(" ");
            for(int j = 0; j<n; j++){
                map[i][j] = Integer.parseInt(arr[j]);
                //맵의 칸이 집(1)이면
                //집 리스트에 넣는다
                if(Integer.parseInt(arr[j]) == 1){
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(i+1);
                    arrayList.add(j+1);
                    houseList.add(arrayList);
                }
                if(Integer.parseInt(arr[j]) == 2){
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(i+1);
                    arrayList.add(j+1);
                    chickenList.add(arrayList);
                }
            }

        }

    }

}
