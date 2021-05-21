package com.ashish.datastructure.recursion.binarysearch;

public class TimeComplexDemo2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        TimeComplexDemo2 demo2 = new TimeComplexDemo2();
        System.out.println(demo2.findNumber(167, arr, 0, arr.length - 1));
    }

    public int findNumber(int expected, int[] A, int startIndex, int lastIndex) {

        if (A[startIndex] == expected) {
            return startIndex;
        } else if (A[startIndex] == A[lastIndex]) {
            if (A[startIndex] == expected) {
                return startIndex;
            }
            return Integer.MIN_VALUE;
        } else {
            int midIndex = (startIndex + lastIndex) / 2;
            if (lastIndex - startIndex == 1) {
                midIndex = lastIndex;
            }
            //System.out.println("midIndex --> " + midIndex);
            int midArrValue = A[midIndex];
            if (midArrValue == expected) {
                return midIndex;
            } else if (midArrValue > expected) {
                return findNumber(expected, A, startIndex, midIndex);
            } else if (midArrValue < expected) {
                return findNumber(expected, A, midIndex, A.length - 1);
            }
            return Integer.MIN_VALUE;
        }
    }
}
