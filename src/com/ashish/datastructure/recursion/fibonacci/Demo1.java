package com.ashish.datastructure.recursion.fibonacci;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(fib(1000000000));
    }
    static int fib(int n){
        if(n==0) return -1;
        else if(n==1|n==2) return n-1;
        else {
            System.out.println("Else block");
            return fib(n-1) + fib(n-2);
        }
    }
}
