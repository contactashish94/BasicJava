package com.ashish.datastructure.recursion.factorial;

public class Demo1 {
    public static void main(String[] args) {
        Long start = System.nanoTime();
        System.out.println(m1(10000000));
        Long end = System.nanoTime();
        System.out.println("Total time to execute by factorial by recursion loop  : =" + (end-start));
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
