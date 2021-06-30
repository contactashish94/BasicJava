package com.ashish.interview.interviewkit.persistent;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {1,2,3}, {1,2,3}
        };

        int[][] arr2 = {
                {1,2,3},
                {1,2,3}, {1,2,3}
        };
        int[][] product=new int[3][3];
        int sum = 0;
            for(int i = 0 ; i < 3; i ++){
                for(int j = 0 ; j < 3;j++){
                    for(int k = 0 ; k < 3;k++){
                        sum=sum+arr[i][k]+arr2[k][i];
                    }
                    System.out.print(sum+" ");
                }
                System.out.println();
            }
    }
}
