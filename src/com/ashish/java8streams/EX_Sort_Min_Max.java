package com.ashish.java8streams;

import java.util.ArrayList;
import java.util.List;

public class EX_Sort_Min_Max {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>() ;
        marks.add(23);
        marks.add(21);
        marks.add(22);
        marks.add(25);
        marks.add(26);
        marks.add(36);
        marks.add(47);

        System.out.println(marks.stream().min((i1,i2) -> i1.compareTo(i2)));
        System.out.println(marks.stream().max((i1,i2) -> i1.compareTo(i2)));
    }
}
