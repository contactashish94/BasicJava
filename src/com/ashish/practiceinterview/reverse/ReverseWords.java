package com.ashish.practiceinterview.reverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "India is a great Country";
        List<String> list = Arrays.asList(str.split("\\s"));
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
            sb.append(' ');
        }
        System.out.println(sb);
    }
}
