package com.ashish.interview.hackerrank.regexstudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[^a-z]");
        Matcher m = p.matcher("a7b@Z#9");
        while (m.find()){
            System.out.println(m.start()+"-----"+m.group());
        }
    }
}
