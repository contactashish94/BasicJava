package com.ashish.interview;

import java.util.HashMap;
import java.util.Map;

public class HashMapSurgery {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1234", "Ashish");
        map.put("2345", "Kumar");
        map.put("3456", "Pandey");
        map.put("4567", "Sonu");

        for (Map.Entry<String, String>  entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
    }
}
