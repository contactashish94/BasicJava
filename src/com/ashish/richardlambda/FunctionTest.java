package com.ashish.richardlambda;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        Function<Integer, String> testFunction = i -> i+"-->"+"Hello";

        System.out.println(testFunction.apply(10));
    }
}
