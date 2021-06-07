package com.ashish.interview.hackerrank.regexstudy.regex.ex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[abc]");
        Matcher m = p.matcher("abcdefgh");
        while (m.find()){
            System.out.println(m.start()+"----"+m.group());
        }
    }
}
