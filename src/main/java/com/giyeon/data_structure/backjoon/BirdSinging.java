package com.giyeon.data_structure.backjoon;

import java.io.*;

public class BirdSinging {

    private static int i = 1;
    private static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int initialBirdNum = Integer.parseInt(br.readLine());

        for(i = 1; initialBirdNum>0; i++) {

            if (i < initialBirdNum) {
                //자연수보다 새 숫자 크면 카운드 하나 올리고 새 숫자 빼기
                initialBirdNum = initialBirdNum - i;
                count++;

            } else if (i==initialBirdNum) {
                //새 숫자랑 자연수랑 같으면 다 날라가닌까 숫자 하나 올리고 루프 종료
                count++;
                break;

            }else{
                //자연수가 새 수보다 크면 자연수를 다시 0부터 시작한다.
                i = 0;
            }

        }

        String singingSeconds = String.valueOf(count);

        bw.write(singingSeconds);
        bw.flush();
        bw.close();
        br.close();

        }
    }
