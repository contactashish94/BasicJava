package com.ashish.java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EX_Consume {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>() ;
        marks.add(2);
        marks.add(3);
        marks.add(3);
        marks.add(5);
        marks.add(26);
        marks.add(36);

        Consumer<Integer> c = i -> {
            System.out.println("sqaure value --> " + i*i);
        };

        marks.stream().forEach(i -> {
            System.out.println("sqaure value --> " + i*i);
        });

        Integer[] arr = marks.stream().toArray(Integer[]::new);

        Arrays.stream(arr).forEach(i -> {
            System.out.println("Printing array value --> " + i*i);
        });
    }
}
