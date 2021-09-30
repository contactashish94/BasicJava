package com.ashish.test;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class TestStates {
    public static void main(String[] args) {
        List<States> list = new ArrayList<>();
        list.add(new States("CL", "AUS"));
        list.add(new States("CL", "EU"));
        list.add(new States("CUL", "IN"));
        list.add(new States("CLA", "US"));
        list.add(new States("DAL", "US"));
        list.add(new States("ON", "CA"));
        list.add(new States("CAB", "CA"));

        List<States> listed = list.stream().sorted(
                (s1,s2) -> {
                    if(s1.getCountry().compareTo(s2.getCountry())>0){
                        return 1;
                    } else if(s1.getCountry().compareTo(s2.getCountry())<0){
                        return -1;
                    } else {
                        return 0;
                    }
                }
        ).collect(Collectors.toList());

        listed.stream().forEach(s -> System.out.println(s.getState()+"---"+s.getCountry()));

        System.out.println("Done----------------");
        Map<String , String> mapp = list.stream().collect(Collectors.toMap(States::getState, States::getCountry,(o1,o2) -> o2));
        System.out.println("Done----------------For Each Start");
        for (Map.Entry entry: mapp.entrySet()) {
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }


    }
}