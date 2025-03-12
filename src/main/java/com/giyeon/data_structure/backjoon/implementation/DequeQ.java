package com.giyeon.data_structure.backjoon.implementation;

import java.util.ArrayDeque;

public class DequeQ {

    public boolean v1(String s){
        int open=0;
        ArrayDeque<String> queue = new ArrayDeque<>();
        String[] arr = s.split("");

        for(int i = 0; i<arr.length; i++){
            queue.offerFirst(arr[i]);
        }


        for(int i = 0; i<arr.length; i++){
            String lastVal = queue.pollLast();

            if(lastVal.equals("(")) {
                open+=1;
            }else{
                if(open==0){
                    return false;
                }else{
                    open-=1;
                }
            }
        }

        if(open>0){return false;}
        return true;
    }

    public boolean v2(String s){

        ArrayDeque<String> stack = new ArrayDeque<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.offerFirst("(");
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    stack.pollFirst();
                }
            }
        }

        if(!stack.isEmpty()){return false;}
        return true;
    }

}
