package com.ashish.datastructure.divideandconquer;

public class FibonacciByWhile {

    public static void main(String[] args) {
        int num = 10000000;
        Long start = System.nanoTime();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a+" "+b+" ");
        while(num>0){
            num--;
            c = a + b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        System.out.println();
        Long end = System.nanoTime();
        System.out.println("Total time to execute: =" + (end-start));
    }

}
