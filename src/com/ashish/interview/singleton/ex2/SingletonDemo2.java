package com.ashish.interview.singleton.ex2;

public class SingletonDemo2 {
    public static void main(String[] args) {
        boolean check = isPrime(7);
        System.out.println(check);

    }

    private static boolean isPrime(int n){
        if(n==1) {
            return false;
        }
        //for(int i = 2; i <= n/2;i++){
        System.out.println("SqRt value - " + Math.sqrt(n));
        for(int i = 2; i <= (long) Math.sqrt(n);i++){
            if(n % i == 0){
                System.out.println(n + " is not a prime number, it was divisible by " + i );
                return false;
            }
        }
        System.out.println(n + " is a prime number");
        return true;
    }
}
