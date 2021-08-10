package com.ashish.datastructure.dynamicprogramming;

import java.util.Arrays;

public class Fibonacci_DP_BottomUp {


    static int[] table;
    public static void CalculateFibonacci(int n) {
        table=new int[n+1];

        table[0]=0;
        table[1]=1;
        for(int i = 2; i<=n;i++){
            table[i]= table[i-1]+table[i-2];
        }
        System.out.println(Arrays.toString(table));
    }


    public static void main(String[] args) {

        Long start = System.nanoTime();
        CalculateFibonacci(10);
        Long end = System.nanoTime();

        System.out.println();
        System.out.println("Total time to execute by Dynamic Programming: =" + (end-start));
    }// end of method

}
