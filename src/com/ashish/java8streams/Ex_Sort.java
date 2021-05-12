package com.ashish.java8streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_Sort {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>() ;
        marks.add(23);
        marks.add(21);
        marks.add(22);
        marks.add(25);
        marks.add(26);
        marks.add(36);
        marks.add(47);
        System.out.println(marks);

        List sortedMarks = marks.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedMarks);

        List upSideDownSort = marks.stream()
                .sorted((i1,i2) -> (i1<i2)?1:(i1>i2)?-1:0)
        .collect(Collectors.toList());

        System.out.println(upSideDownSort);

        List sortNewWay = marks.stream()
                .sorted((i1,i2) -> i2.compareTo(i1))
                .collect(Collectors.toList());

        System.out.println(sortNewWay);
    }
}
