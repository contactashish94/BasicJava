package com.ashish.functionalinterfaces;
import java.util.function.Predicate;


@FunctionalInterface
public interface IntPred<T> {
    boolean test(Integer value);
}
