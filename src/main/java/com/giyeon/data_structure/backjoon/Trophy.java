package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class Trophy {

    public static int countVisibleTrophyNum = 0;
    public static int tallestTrophyHeight = 0;

    public static void main(String[] args) throws IOException{

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //트로피 크기를 하나씩 담을 리스트를 만들었다.
        ArrayList<Integer> trophyHeightList = new ArrayList<>();

        //총 개수N을 받아온다.
        int totalCount = Integer.parseInt(br.readLine());

        //개수만큼 루프를 돌려 Array에 집어 넣는다.
        for(int i=0; i < totalCount; i++){
            int eachTrophyHeight = Integer.parseInt(br.readLine());
            trophyHeightList.add(eachTrophyHeight);
        }

        //하나씩 루프를 돌면서 가장 큰 트로피 높이와 볼수있는 트로피 수를 업데이트 한다.
        int visibleTrophyNum = countVisibleTrophy(trophyHeightList);

        //리스트 뒤집기(오른쪽부터 보기 위해)
        Collections.reverse(trophyHeightList);
        int rightVisibleTrophyNum = countVisibleTrophy(trophyHeightList);

        String left = String.valueOf(visibleTrophyNum);
        String right = String.valueOf(rightVisibleTrophyNum);
        bw.write(left+"\n");
        bw.write(right);
        bw.flush();
        bw.close();
        br.close();

    }

    private static int countVisibleTrophy(ArrayList<Integer> trophyHeightList){
        for(int eachTrophyHeight : trophyHeightList){
            //처음이면 처음 트로피 크기를 바탕으로 변수 업데이트
            if(countVisibleTrophyNum==0 & tallestTrophyHeight==0){
                countVisibleTrophyNum++;
                tallestTrophyHeight = eachTrophyHeight;

            }else if(tallestTrophyHeight >= eachTrophyHeight) {
                //뒤에 나온 트로피가 작거나 같으면 그냥 다음 턴으로 넘어가기
                continue;
            }else{
                //뒤에 나온 트로피가 크면 업데이트
                countVisibleTrophyNum++;
                tallestTrophyHeight = eachTrophyHeight;
            }

        }
        //배열에 담기
        int finalCountVisibleTrophyNum = countVisibleTrophyNum;

        //static변수 초기화
        countVisibleTrophyNum = 0;
        tallestTrophyHeight = 0;

        return finalCountVisibleTrophyNum;
    }

}
