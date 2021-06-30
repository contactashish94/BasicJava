package com.ashish.interview.interviewkit.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotate2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int rotations = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = rotateArray(arr, rotations);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }

    private static int[] rotateArray(int[] arr, int rotations) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int index = (i + arr.length - rotations) % arr.length;
            arr2[index] = arr[i];
        }
        return arr2;
    }
}
