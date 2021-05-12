package com.ashish.office.test;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();
        LinkedHashMap<String, String> table = new LinkedHashMap<>();

        table.put("ashish", "123");
        table.put("ashish", "1234");


        map.put(new Employee("Ankit"), "001");
        map.put(new Employee("Kumar"), "123");
        map.put(new Employee("Ashish"), "002");
        map.put(new Employee("John"), "1245");

        System.out.println(table);



        java.util.Properties lookupConfig=new java.util.Properties();
        lookupConfig.putAll(map);
        try {
            lookupConfig.store(new FileOutputStream("C:\\Ashish\\Test.properties"),null);

            System.out.println("Placed");
        } catch (IOException e) {
            System.out.println("catch Block");
            e.printStackTrace();
        }
    }
}
