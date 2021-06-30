package com.ashish.interview.interviewkit.arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr= {2,3,4,5,6,7,8};
        int[] arr2= new int[arr.length];
        for(int i = arr.length-1,j=0;i>=0;i--,j++){
            arr2[j]=arr[i];
        }

    }
}
