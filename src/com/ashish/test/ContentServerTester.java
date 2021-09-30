package com.ashish.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContentServerTester {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Renewal");
        list.add("Audit");


        //("Attr_38920_12" : "5693654" AND ("Attr_38920_6" : "Renewal" OR "Attr_38920_6" : "Audit"))
        String str ="(\"Attr_38920_12\"";
        str = str + " : \"5693654\" AND ";
        String newstr = "(\"Attr_38920_6\"";
        String defaultStr = "\"Attr_38920_6\"";

        Iterator<String> itr = list.iterator();

        for(int i = 0 ; i < list.size();i++){
            if(i>0){
                newstr = newstr+" OR "+defaultStr+" : \""+list.get(i)+"\"";
            } else {
                newstr = newstr + " :" + " \""+list.get(i) +"\"";
            }
            System.out.println(newstr);
        }
        System.out.println(str+newstr+"))");


    }
}
