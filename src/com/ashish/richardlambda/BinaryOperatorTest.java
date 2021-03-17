package com.ashish.richardlambda;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperator<Long> add = (x,y) -> (x+y);
    }
}
