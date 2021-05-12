package com.ashish.java8streams;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<Integer> listInt = new ArrayList<>();


        list.add("India");
        list.add("India1");
        list.add("India2");
        list.add("India3");
        //list.add("India3");


        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        listInt.add(10);
        listInt.add(11);
        listInt.add(12);
        listInt.add(13);

        System.out.println(listInt.stream().filter(x -> x==13).count());

    }
}
