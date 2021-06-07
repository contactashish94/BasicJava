package com.ashish.test;

public class Main {
    public static void main(String[] args) {
        String str  = "713234456";
        //str = str.replace(str.substring(str.length()-6),"");
        System.out.println(str.length()-6);
        System.out.println(str.substring(str.length()-6));

        String abcd = "AshishKumar";
        System.out.println(abcd.substring(5));
    }
}
