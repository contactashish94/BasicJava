package com.ashish.datastructure.recursion;

public class TimeComplexCalculator {

    public static void main(String[] args) {
        int[] arr = {12,23,4,45,76,8,9,9,4,6,7,77};
        int high = findBiggest(arr,arr.length);
        System.out.println(high);
    }
    static int findBiggest(int[] A, int length){
        int highest  = Integer.MIN_VALUE;
        if(length == -1){
            return highest;
        }
        else {
            if(A[length-1]>highest){
                highest = A[length];
            }
            return findBiggest(A,length-1);
        }
    }
}
