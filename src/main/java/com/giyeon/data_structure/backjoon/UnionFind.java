package com.giyeon.data_structure.backjoon;

import java.io.*;

public class UnionFind {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String NAndM = br.readLine();
        String[] split = NAndM.split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        int[] arr = new int[n+1];//0부터 인덱스가 n까지 있는 배열을 생성한다.

        //0~n까지의 인덱스에 0~n 까지의 값이 들어가 있다.
        for(int i = 0; i < n+1; i++) {
            arr[i] = i;
        }

        //주어진 명령과 값 두개를 보면서 경우에 따라 연산을 수행한다.
        //인덱스 = 값
        //값 = 부모
        //a , b는 값이닌까 인덱스이다
        for (int i = 0; i < m; i++) {
            String calculation = br.readLine();
            String[] commandAndNum = calculation.split(" ");
            int command = Integer.parseInt(commandAndNum[0]);
            int a = Integer.parseInt(commandAndNum[1]);
            int b = Integer.parseInt(commandAndNum[2]);

            if (command == 0) {
                if(a<b){
                  //b인덱스의 최상위 부모를 a 부모의 아래에 둔다
                    int parent = getParent(b, arr);
                    arr[parent] = getParent(a, arr);
                }else if(a>b){
                    //a인덱스의 최상위 부모를 b부모의 아래로 둔다.
                    int parent = getParent(a, arr);
                    arr[parent] = getParent(b, arr);
                }
            }else {//1인경우
                //조건 : a의 최상위 부모와 b의 최상위 부모가 같으면
                //결과 : Yes출력
                //조건 : a의 최상위 부모와 b의 최상위 부모가 다르면
                //결과 : No 출력
                if(getParent(a,arr)==getParent(b,arr)){
                    bw.write("YES\n");
                }else{
                    bw.write("NO\n");
                }
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }
    public static int getParent(int b, int[] arr) {
        if(b==arr[b]){
            return b;
        }else{
            return arr[b] = getParent(arr[b], arr);
        }
    }
}
