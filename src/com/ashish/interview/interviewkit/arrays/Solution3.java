package com.ashish.interview.interviewkit.arrays;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        int result = hourglass(arr);
        System.out.println(result);

    }
    public static int hourglass(int[][] arr) {
        int maxValue = Integer.MIN_VALUE;
        int rows = 4;
        int column = 4;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]
                        +arr[i+1][j+1]+
                        arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sum>maxValue){
                    maxValue=sum;
                }
            }

        }
        return maxValue;

    }
}
