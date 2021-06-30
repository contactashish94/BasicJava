package com.datastructure.recursion.ex1;

public class RecursionDemo1 {
    public static void main(String[] args) {
        foo(3);
    }
    static void foo(int n){
        if(n<0){
            System.out.println("Value with 0");
        }
        else{
            foo(n-1);
        }
        System.out.println("Print line execusting with --> " + n);
    }
}
