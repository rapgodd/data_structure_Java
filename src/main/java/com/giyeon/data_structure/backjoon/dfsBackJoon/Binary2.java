package com.giyeon.data_structure.backjoon.dfsBackJoon;

public class Binary2 {

    public static void main(String[] args) {

        int[] binarySearchArray = new int[]{2,4,7,10,15,20,25,30,40,50};
        int target = 7;

        int startIndex = 0;
        int endIndex = 9;

        int indexOfTarget = findTargetNum(binarySearchArray, startIndex, endIndex, target);
        System.out.println("indexOfTarget = " + indexOfTarget);

    }

    private static int findTargetNum(int[] binarySearchArray, int startIndex, int endIndex, int target) {

        int mid = (startIndex + endIndex) / 2;

        if(binarySearchArray[mid] == target){
            return mid;
        } else if (binarySearchArray[mid]<target) {
            startIndex = mid + 1;
            return findTargetNum(binarySearchArray, startIndex, endIndex, target);
        } else {
            endIndex = mid - 1;
            return findTargetNum(binarySearchArray, startIndex, endIndex, target);
        }

    }

}
