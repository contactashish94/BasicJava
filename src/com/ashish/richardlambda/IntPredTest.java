package com.ashish.richardlambda;

import com.ashish.functionalinterfaces.IntPred;

public class IntPredTest {

    public static void main(String[] args) {

        IntPred<Integer> testObj = i -> i+2>2;

    }
    private static String get(IntPred<String> i, boolean b){
        return i+"8";
    }
}
