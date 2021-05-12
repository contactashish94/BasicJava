package com.ashish.java8streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() ;
        list.add(2);
        list.add(21);
        list.add(22);
        list.add(25);
        list.add(26);
        list.add(36);
        list.add(47);
        System.out.println(list);
        List list1 = list.stream().filter(a -> a%2==0).collect(Collectors.toList());
        System.out.println(list1);
    }
}
