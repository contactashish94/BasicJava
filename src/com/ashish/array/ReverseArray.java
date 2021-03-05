package com.ashish.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,45,67,12,23,455};
        int[] revArray = new int[arr.length];

        int j = arr.length;
        for(int i = 0; i < arr.length ; i++){
            revArray[j-1] = arr[i];
            j = j-1;
        }

        System.out.println("Converted Arrays " + Arrays.toString(revArray));
    }
}
