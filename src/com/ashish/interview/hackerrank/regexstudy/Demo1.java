package com.ashish.interview.hackerrank.regexstudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("ababbab");
        int count=0;
        while (m.find()){
            count++;
            System.out.println(m.start()+"--"+m.end()+"---"+m.group());
        }
        System.out.println(count);
    }
}
