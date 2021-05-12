package com.ashish.java8.devoxx.designappeternsclass;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Sample {

    static int totalValue(List<Integer> integerList){
        int total = 0;
        for(int e : integerList){
            total += e;
        }
        return  total;
    }

    static int totalValue_1(List<Integer> values, Predicate<Integer> selector){
        /*int total = 0;
        for(int e : values){
            if(selector.test(e)) total += e;
        }
        return  total;*/

        return values.stream()
                .filter(selector)
                .mapToInt(e -> e)
                .sum();
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(totalValue(numbers));
        System.out.println(totalValue_1(numbers, e -> true));
        System.out.println(totalValue_1(numbers, e -> e%2==0));
        System.out.println(totalValue_1(numbers, e -> e%2!=0));
    }
}
