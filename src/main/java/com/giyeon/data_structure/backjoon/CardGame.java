package com.giyeon.data_structure.backjoon;

import java.util.*;

public class CardGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        Integer[] ints = parseIntMethod(nextLine);

        int N = ints[0];
        int M = ints[1];

        String secondLine = scanner.nextLine();
        Integer[] givenNums = parseIntMethod(secondLine);

        List<Integer> combinations = getCombinations(givenNums);

        Set<Integer> set = new HashSet<>(combinations);

        //comparator사용을 위해 다시 리스트로
        List<Integer> result = new ArrayList<>(set);
        result.sort(Comparator.reverseOrder());

        int finalNum = 0;
        for (int i = 0; i < result.size(); i++) {
            if(result.get(i)>M){
                continue;
            }
            finalNum = result.get(i);
            break;
        }
        System.out.println(finalNum);
    }

    private static Integer[] parseIntMethod(String line) {
        String[] split = line.split(" ");
        Integer[] nums = new Integer[split.length];
        for (int i = 0; i < split.length; i++) {
            int i1 = Integer.parseInt(split[i]);
            nums[i] = i1;
        }
        return nums;
    }

    private static List<Integer> getCombinations(Integer[] givenNums) {
        List<Integer> sumList = new ArrayList<Integer>();
        for (int i = 0; i < givenNums.length; i++) {
            Integer givenNum1 = givenNums[i];
            for (int j = i+1; j < givenNums.length; j++) {
                Integer givenNum2 = givenNums[j];
                for (int k = j+1; k < givenNums.length; k++) {
                    Integer givenNum3 = givenNums[k];
                    sumList.add(givenNum1 + givenNum2 + givenNum3);
                }
            }
        }
        return sumList;
    }
}
