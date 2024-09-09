package com.giyeon.data_structure.collection.set;

public class StringHashMain {

    static final int Capacity = 10;

    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';

        System.out.println("charB = " + (int)charB);
        System.out.println("charA = " + (int)charA);

        /**
         * 문자열인 경우 이 문자열을 해시코드로 변환
         */
        String word = "Hello 22World";
        int hashCode = hashCode(word);
        System.out.println("hashCode = " + hashCode);
        int i = hashIndex(hashCode);
        System.out.println("i = " + i);
    }

    private static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            sum += (int)charArray[i];
        }
        return sum;
    }

    private static int hashIndex(int hashcode) {
        hashcode %= Capacity;
        return hashcode;
    }

}
