package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class CardCompareSumV1 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> cardList = insertCardToList(br);

        int minSum = cardList.get(0);

        int finalMinSum = getMinSum(cardList, minSum);
        bw.write(String.valueOf(finalMinSum));

        bw.flush();
        bw.close();
        br.close();

    }

    private static Integer getMinSum(List<Integer> cardList, int minSum){

        for(int i = 1; i < cardList.size(); i++){
            int beforeNum = minSum;
            minSum += cardList.get(i);
            if(i!=1){
                minSum += beforeNum;
            }
        }
        return minSum;

    }

    private static List<Integer> insertCardToList(BufferedReader br) throws IOException {
        int loop = Integer.parseInt(br.readLine());
        List<Integer> cardAmountList = new ArrayList<>();

        for (int i = 0; i < loop; i++){
            int amountOfCards = Integer.parseInt(br.readLine());
            cardAmountList.add(amountOfCards);
        }

        Collections.sort(cardAmountList);
        return cardAmountList;
    }
}
