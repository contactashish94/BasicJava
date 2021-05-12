package com.ashish.java8streams;

import java.util.ArrayList;
import java.util.List;

public class Ex_ParallelStream {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>() ;
        marks.add(23);
        marks.add(21);
        marks.add(22);
        marks.add(25);
        marks.add(26);
        marks.add(36);
        marks.add(47);


        //marks.stream().forEach(System.out::println);
        marks.parallelStream().sorted().forEachOrdered(System.out::println);

    }
}
