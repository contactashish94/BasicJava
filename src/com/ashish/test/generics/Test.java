package com.ashish.test.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<String>();
        ArrayList<Integer> ll = new ArrayList<>();
        HashSet set = new HashSet();
        set.add("ashishu");
        set.add("ashishu123");
        set.add("123ashishu");
        set.add("123");
        l.add("Ashish");
        l.add("AshishKumar");
        m1(l);
        l.add(true);
        System.out.println(l);

        l.stream().forEach(System.out::println);
        System.out.println("-----");
        set.stream().forEachOrdered(System.out::println);
        System.out.println("-------------");

        ll.add(1);
        ll.add(5);
        ll.add(2);
        System.out.println(ll.stream().max((a,b)-> a-b));

        Optional<String> op = Optional.empty();
        //String book = "booking1";
        String book = null;
        op = Optional.ofNullable(book);
        System.out.println(op.orElse("Hello").toUpperCase());
        op.isPresent();

    }
    static void m1(ArrayList l){
        l.add(1);
        l.add(11);
    }

}
