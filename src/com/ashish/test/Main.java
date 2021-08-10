package com.ashish.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

public class Main implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        return 0;
    }

    public static void main(String[] args) throws Exception {
       /* String str  = "713234456";
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

        final ArrayList<String> list = new ArrayList<>();
        Set s = new HashSet();
        s.add("a");
        LinkedHashMap map = new LinkedHashMap();

        HashMap map1 = new HashMap(25,0.90F);



        //map.put()

        map1.put("Naveen", 100);
        map1.put("Tom", 1200);

        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");

        System.out.println(list);

        System.out.println("ash ish".toUpperCase()); */

        HashSet<String> set = new HashSet<>();
        set.add("Ashish");
        set.add("Ashish");

        System.out.println(set);




        BufferedWriter writer = new BufferedWriter(new FileWriter("abcd.txt"));
        for(int i = 0; i < 3000000; i++){
            String str = "Hello"+i+" , ";
            writer.write(str);
        }
        writer.close();
        System.out.println("Executed all");

    }
}
