package com.ashish.test;

public class Factorial {

    public static void main(String[] args) {
        int num = 66;
        long result = 1;
        Long start = System.nanoTime();
        while (num!=0){
            result = num*result;
            num--;
            System.out.println("now : result = " + result);
        }
        System.out.println(result);
        System.out.println(Long.MAX_VALUE);
        Long end = System.nanoTime();
        System.out.println("Total time to execute by factorial by while loop  : =" + (end-start));
    }
}
