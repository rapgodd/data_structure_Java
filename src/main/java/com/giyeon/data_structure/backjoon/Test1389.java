package com.giyeon.data_structure.backjoon;

import java.util.*;
import java.io.*;


public class Test1389 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] personNumAndRelationNum = br.readLine().split(" ");
        int personNum = Integer.parseInt(personNumAndRelationNum[0]);
        int relationNum = Integer.parseInt(personNumAndRelationNum[1]);

        int[] minRule = new int[]{0,0};
        Deque<int[]> personAndPathCount = new ArrayDeque<>();
        int[][] relations = new int[personNum + 1][];

        fillRelations(relations, br, relationNum, personNum);
        int result = getMinRule(minRule, personAndPathCount, relations,personNum);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();

    }

    private static int getMinRule(int[] minRule, Deque<int[]> personAndPathCount, int[][] relations, int personNum) {

        for(int i = 1; i<=personNum; i++){
            int sum = 0;
            int[] relation = relations[i];
            int length = relation.length;
            boolean[] visited = new boolean[personNum + 1];


            for (int j = 0; j < length; j++) {
                int i1 = relation[j];
                int[] node = new int[]{i1,1};
                personAndPathCount.offerLast(node);
                sum += 1;
                visited[i1] = true;
            }

            while(!personAndPathCount.isEmpty()){
                int[] node1 = personAndPathCount.pollFirst();
                int[] closeFriends = relations[node1[0]];

                for(int closeFriend : closeFriends){
                    if(!visited[closeFriend]){
                        personAndPathCount.offerLast(new int[]{closeFriend,node1[1]+1});
                        sum += node1[1] + 1;
                        visited[closeFriend] = true;
                    }
                }
            }

            if(minRule[0]==0){
                minRule[0] = i;
                minRule[1] = sum;
            }else if(minRule[1]>sum){
                minRule[0] = i;
                minRule[1] = sum;
            }
        }

        return minRule[0];

    }

    private static void fillRelations(int[][] relations,
                                      BufferedReader br,
                                      int relationNum,
                                      int personNum) throws IOException {
        // 1) 모든 행을 길이 0의 배열로 초기화
        //    => 이후 관계를 추가할 때마다 크기를 확장
        for(int i = 0; i <= personNum; i++){
            relations[i] = new int[0];
        }

        // 2) 입력받은 관계에 따라 2차원 배열을 동적으로 채움
        for(int i = 0; i < relationNum; i++){
            String[] relationStr = br.readLine().split(" ");
            int from = Integer.parseInt(relationStr[0]);
            int to = Integer.parseInt(relationStr[1]);

            // from이 to와 친구 관계, to가 from과 친구 관계
            relations[from] = addValue(relations[from], to);
            relations[to]   = addValue(relations[to], from);
        }
    }

    // 배열의 크기를 1 늘리고, value를 추가
    private static int[] addValue(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[newArr.length - 1] = value;
        return newArr;
    }

    }


