package com.ashish.richardlambda;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        Predicate<Integer> testPredicate = (i) -> (i<20);
        Predicate<Integer> testPredicate1 = (i) -> (i<20);

        System.out.println(testPredicate.test(110));
        System.out.println(testPredicate.getClass().getName());
        System.out.println(testPredicate1.getClass().getName());
    }
}
