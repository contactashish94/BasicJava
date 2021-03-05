package com.ashish.list.arraylist;

import java.util.ArrayList;

public class ArrayListDebug {
    public static void main(String[] args) {
        ArrayList<String[]> list = new ArrayList<>();

        Integer value = 56;
        int x = 56;//value.intValue(); ---> Same things

        String fileName = "constant_ABCD_constant2";

        String strDynamic = fileName.substring(0,9);
        String strDynamic1 = fileName.substring(9);
        String strDynamic2 = strDynamic1.substring(0,4);

        System.out.println(strDynamic);
        System.out.println(strDynamic1);
        System.out.println(strDynamic2);
    }
}
