package com.ashish.operators;

public class OperatorsChallenge {

    public static void main(String[] args) {
        double var1 = 20.00d;
        double var2 = 80.00d;

        double value = var1 + var2 * 100;

        System.out.println("Total value ---"  + value);

        double remainder = value % 40.00d;

        System.out.println("remainder-- " + remainder);

        boolean isRemainder = (remainder==0) ?true:false;

        System.out.println(isRemainder);

    }
}
