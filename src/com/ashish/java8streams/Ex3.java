package com.ashish.java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

public class Ex3 {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Red", 68));
        personList.add(new Person("Red", 69));
        personList.add(new Person("Black", 70));
        personList.add(new Person("Orange", 71));
        personList.add(new Person("Orange", 71));
        //personList.add(new Person("Red", 72));

        personList.removeIf(b -> b.getWeight()==69);

        int sum = personList.stream()
                .filter(b -> b.getColor()=="Red")
                .mapToInt(b -> b.getWeight())
                .sum();





        System.out.println(sum);
    }
}
