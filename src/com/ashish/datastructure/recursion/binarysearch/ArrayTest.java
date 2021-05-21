package com.ashish.datastructure.recursion.binarysearch;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr= {2,4,5,6,0,8,9,0,4,0,5,0,0,0};
        //Arrays.sort(arr);
        for (int value: arr) {
            System.out.println("Value ---> " + value);
        }
        System.out.println("<--------- ---> ");
        int[] arr1;
        arr1 = new int[10];
        arr1[1]=1;
        arr1[2]=2;
        arr1[3]=3;
        arr1[4]=4;
        arr1[5]=5;
        for (int value: arr1) {
            System.out.println("Value ---> " + value);
        }
    }
}
