package com.ashish.java8streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Red", 68));
        personList.add(new Person("Red", 69));
        personList.add(new Person("Black", 70));
        personList.add(new Person("Orange", 71));
        personList.add(new Person("Orange", 71));

        List<Person> personListNew = personList.stream()
                .filter(b -> b.getColor() == "Red")
                .collect(Collectors.toList());

        Stream s = personList.stream();

        System.out.println(personListNew.stream().count());;
    }
}
