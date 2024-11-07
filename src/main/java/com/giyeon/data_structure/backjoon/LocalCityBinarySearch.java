package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class LocalCityBinarySearch {
    static int temp;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ListOfMoneyEachStateNeeds = new ArrayList<>();
        int minOfMaximumAllocatedMoney;
        int maxOfMaximumAllocatedMoney;
        int SumOfMoneyByMid = 0;
        int mid = 0;


        int amountOfStates = Integer.parseInt(br.readLine());

        returnListOfMoneyEachStateNeeds(br,ListOfMoneyEachStateNeeds);

        int moneyGovernmentHas = Integer.parseInt(br.readLine());
        
        //각 지차체별 예산 할당 최대 금액
        //상한선 최대 최소 범위 설정.
        minOfMaximumAllocatedMoney = ListOfMoneyEachStateNeeds.get(0);
        maxOfMaximumAllocatedMoney = ListOfMoneyEachStateNeeds.get(amountOfStates-1);
        
        //목표보다 작으면 임시 저장 
        //크면 저장 안함
        calculateMaxOfMaximumAllocatedMoney(minOfMaximumAllocatedMoney, maxOfMaximumAllocatedMoney, mid, SumOfMoneyByMid,moneyGovernmentHas, ListOfMoneyEachStateNeeds);

        bw.write(String.valueOf(temp));
        bw.flush();
        bw.close();
        br.close();

    }

    private static void calculateMaxOfMaximumAllocatedMoney(int minOfMaximumAllocatedMoney, int maxOfMaximumAllocatedMoney, int mid, int SumOfMoneyByMid,int moneyGovernmentHas, ArrayList<Integer> ListOfMoneyEachStateNeeds) {

        while(minOfMaximumAllocatedMoney<=maxOfMaximumAllocatedMoney){

            mid = getMid(minOfMaximumAllocatedMoney, maxOfMaximumAllocatedMoney);
            SumOfMoneyByMid = 0;

            for(Integer eachMoneyStateNeed : ListOfMoneyEachStateNeeds){
                if(eachMoneyStateNeed<mid){
                    SumOfMoneyByMid += eachMoneyStateNeed;
                }else{
                    SumOfMoneyByMid += mid;
                }
            }

            if(SumOfMoneyByMid<=moneyGovernmentHas) {
                //혹시나 이 값이 최댓값일 확률도 있으니 담아 놓는다.
                temp = mid;
                minOfMaximumAllocatedMoney = mid + 1;
            }else{
                maxOfMaximumAllocatedMoney = mid - 1;
            }

        }

    }

    private static int getMid(int minOfMaximumAllocatedMoney, int maxOfMaximumAllocatedMoney) {
        return (minOfMaximumAllocatedMoney+maxOfMaximumAllocatedMoney)/2;
    }


    private static void returnListOfMoneyEachStateNeeds(BufferedReader br, ArrayList<Integer> listOfMoneyEachStateNeeds) throws IOException{
        String[] howMuchMoneyDoesEachStateNeedArr = br.readLine().split(" ");

        for(String howMuchMoneyDoesEachStateNeed : howMuchMoneyDoesEachStateNeedArr){
            Integer  howMuchMoneyDoesEachStateNeedInt = Integer.parseInt(howMuchMoneyDoesEachStateNeed);
            listOfMoneyEachStateNeeds.add(howMuchMoneyDoesEachStateNeedInt);
        }
        Collections.sort(listOfMoneyEachStateNeeds);
    }

}
