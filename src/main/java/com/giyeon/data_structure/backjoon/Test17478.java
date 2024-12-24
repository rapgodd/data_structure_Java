package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;


public class Test17478 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int loopCount = Integer.parseInt(br.readLine());

        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");

        recursiveFunc(0, loopCount,sb);
        String answer = sb.toString();
        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();
    }

    private static void recursiveFunc(int currentCount,int totalLoopCount,StringBuilder sb){

        if(currentCount==totalLoopCount){
            StringBuilder sb1 = new StringBuilder();

            for(int i = 0; i<totalLoopCount; i++){
                sb1.append("____");
            }

            String stringOf_ = sb1.toString();

            sb.append(stringOf_ + "\"재귀함수가 뭔가요?\"\n");
            sb.append(stringOf_ + "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
            sb.append(stringOf_ + "라고 답변하였지.\n");

            return;
        }

        StringBuilder sb1 = new StringBuilder();
        for(int i = 0; i<currentCount;i++){
            sb1.append("____");
        }

        String stringOf_ = sb1.toString();
        sb.append(stringOf_ + "\"재귀함수가 뭔가요?\"\n");
        sb.append(stringOf_ + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
        sb.append(stringOf_ + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
        sb.append(stringOf_ + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
        recursiveFunc(currentCount + 1, totalLoopCount, sb);

        sb.append(stringOf_ + "라고 답변하였지.\n");

    }

}
