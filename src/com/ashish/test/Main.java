package com.ashish.test;

import java.util.Comparator;

public class Main implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        return 0;
    }

    public static void main(String[] args) {
        String str  = "713234456";
        //str = str.replace(str.substring(str.length()-6),"");
        System.out.println(str.length()-6);
        System.out.println(str.substring(str.length()-6));

        String abcd = "AshishKumar";
        System.out.println(abcd.substring(5));

        String abc = "ALLOY.TESTQ";
        abc = abc.replace("XXXX", "1234");
        System.out.println(abc);

        int i = -6;
        int j = 4;
        System.out.println(i+j);

    }
}
