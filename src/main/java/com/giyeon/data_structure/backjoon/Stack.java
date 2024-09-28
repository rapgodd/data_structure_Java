package com.giyeon.data_structure.backjoon;


import java.util.*;

public class Stack {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();
        Integer beforeNum = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            int requiredNum = sc.nextInt();
            arr[i] = requiredNum;
        }

        //리스트에 +-저장
        List<String> answerList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Integer integer = arr[i];
            if(i==0){
                for (int j = 1; j <= integer; j++) {
                    stack.push(j);
                    answerList.add("+");
                }
                beforeNum = integer;
            }else if(arr[i]>beforeNum){
                for (int j = beforeNum + 1; j <= arr[i]; j++) {
                    stack.push(j);
                    answerList.add("+");
                }
                beforeNum = integer;
            }else{
                if(stack.peek().equals(arr[i])){
                }else {
                    System.out.println("NO");
                    return;
                }
            }
            stack.pop();
            answerList.add("-");
        }
        for (String answer : answerList) {
            System.out.println(answer);
        }

    }

}
