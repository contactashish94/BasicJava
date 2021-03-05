package com.ashish.array;

import java.util.Arrays;

public class MinValueInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,8,1,-1, -9999};
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.println("Total array is" + Arrays.toString(arr) +" & Min Value " + minValue);
    }
}
