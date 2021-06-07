package com.ashish.interview.hackerrank.regexstudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D {
    public static void main(String[] args) {
        //String test = "(\\d{0})";
        //Pattern p = Pattern.compile("[0-9][0-9][0-9]{0,3}[.][0-2][0-5][0-5][.][0-2][0-5][0-5][.][0-2][0-5][0-5]");
        String pattern = "((\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])\\.){3}(\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])";
        //String regexPattern = "((\\d\\d\\d{2,3}|[0-1]\\d\\d)|[1-9]\\d\\d|2[0-4][0-9]|25[0-5])";
        String regexPattern = "([0-1]\\d\\d)";
        String finalPattern= regexPattern+"."+regexPattern;//+"."+regexPattern+"."+regexPattern;
        String[] arr = finalPattern.split(".");
        Pattern p1 = Pattern.compile(finalPattern);
        Matcher m = p1.matcher("100,100");
        if(m.find()){
            System.out.println("Valid");
            System.out.println(m.start()+"----"+m.group());
        }
    }
}
//  String num = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";