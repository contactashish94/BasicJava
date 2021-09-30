package com.ashish.test.java8;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStreamTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ashish", "123");
        map.put("ashishku", "123");
        map.put("ashish123", "123");
        map.put("ashish234", "123");
        map.put("ashish678", "123");

            map
                .entrySet()
                .stream().map(i-> i+i.getValue()+"mapTest...")
                    .filter(i-> i.contains("Test"))
                .collect(Collectors.toSet());

    }
}
