package com.ashish.test;

public class StringImmu {
    public static void main(String[] args) {
        String s1 = new String("ABC");
        String s2 = new String("ABC");
        String s3 = s1.toString();
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
