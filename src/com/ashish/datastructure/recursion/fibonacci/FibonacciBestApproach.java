package com.ashish.datastructure.recursion.fibonacci;

public class FibonacciBestApproach {
    public static void main(String[] args) {
        Long start = System.nanoTime();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a+" "+b+" ");
        for(int i = 2;i<=10000000;i++){
            c = a + b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        Long end = System.nanoTime();
        System.out.println("Total time to execute: =" + (end-start));


    }
}
