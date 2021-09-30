package com.ashish.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableListt {
    public static void main(String[] args) {
        //ImmutableList<String> immutableList = ImmutableList.of("Learning", "Web", "Site", "Java", "Goal");
        List<String> listt = Arrays.asList("Learning", "Web", "Site", "Java", "Goal");
        Collections.unmodifiableList(listt);
    }
}
