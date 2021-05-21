package com.ashish.datastructure.recursion.factorial;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(m1(6));
    }
    static int m1(int n){
        if(n <0){
            return -1;
        }
        else if(n==0){
            return 1;
        }
        else {
            return (n*(m1(n-1)));
        }
    }
}
