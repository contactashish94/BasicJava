package com.ashish.java8streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EX_Map {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>() ;
        marks.add(23);
        marks.add(21);
        marks.add(22);
        marks.add(25);
        marks.add(26);
        marks.add(36);
        marks.add(47);


        List list1 = marks.stream()
                .map(i -> i + 5)
                .collect(Collectors.toList());
        List list2 = marks.stream()
                .filter(i -> i < 26)
                .map(i -> i + 5)
                .collect(Collectors.toList());

        System.out.println(list1);
        System.out.println(list2);


    }
}
