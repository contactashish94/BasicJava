package com.ashish.datastructure.recursion.factorial;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(fib1(1000000000));
    }
    static int fib1(int n){
        int a = 0;
        int b = 1;
        //System.out.print(a + " " + b);
        int c = 0;
        if(n<0) return Integer.MIN_VALUE;
        if(n==0) return a;
        else if (n==1) return b;
        else {
            for (int i = 2; i < n; ++i) {
                c = a + b;
                //System.out.print(" "+c);
                a = b;
                b = c;
            }
            return c;
        }
    }
}
