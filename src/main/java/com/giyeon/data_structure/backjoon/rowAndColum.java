package com.giyeon.data_structure.backjoon;

import java.io.*;

public class rowAndColum {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //count 생성하고 초기화한다
        int count = 0;
        int countColumn = 0;

        //행 열 받아온다
        String heightOfRowsAndSizeOfRows = br.readLine();
        String[] splitHeightOfRowsAndSizeOfRows = heightOfRowsAndSizeOfRows.split(" ");

        int heightOfRows = Integer.parseInt(splitHeightOfRowsAndSizeOfRows[0]);
        int sizeOfRows = Integer.parseInt(splitHeightOfRowsAndSizeOfRows[1]);

         String[][] rowAndColumn = new String[heightOfRows][sizeOfRows];

         //X랑 ..을 이차원 배열에 채워 넣는다 (2500연산)
         for(int i=0; i<heightOfRows; i++){
             String line = br.readLine();
             String[] oneLine = line.split("");
             for(int j = 0; j < sizeOfRows; j++){
                 rowAndColumn[i][j] = oneLine[j];
             }
         }

         //행에서 X가 1개도없는거 찾기
        for(int i = 0; i < heightOfRows; i++){
            for(int j = 0; j<sizeOfRows; j++){
                //X 있음 다음 행으로 넘어가기
                if(rowAndColumn[i][j].equals("X")){
                    break;
                }
                //마지막인데 X한개도 없는경우
                if(j==(sizeOfRows-1)){
                    count++;
                }
            }
        }

        //열에서 X가 하나도 없는지 확인
        for(int i = 0; i < sizeOfRows; i++){
            for(int j = 0; j<heightOfRows; j++){
                //X 있음 다음 열으로 넘어가기
                if(rowAndColumn[j][i].equals("X")){
                    break;
                }
                //마지막인데 X한개도 없는경우
                if(j==(heightOfRows-1)){
                    countColumn++;
                }
            }
        }

        //행 Count보다 열 Count가 적으면 행 Count출력
        //열 Count보다 행 Count가 적으면 열 Count출력
        //둘이 같으면 둘중 하나만 출력
        if(count>countColumn){
            String result = String.valueOf(count);
            bw.write(result);
        }else if(count<countColumn){
            String result = String.valueOf(countColumn);
            bw.write(result);
        }else{
            String result = String.valueOf(count);
            bw.write(result);
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
