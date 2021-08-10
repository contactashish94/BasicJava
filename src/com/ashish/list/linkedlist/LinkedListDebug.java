package com.ashish.list.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDebug {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("abc");
        list.add("Delhi");
        list.add("Bombay");
        list.add("Bangalore");

        list.add(1, "Kolkata");

        list.remove(3);

        //list.remove();

        Iterator i = list.iterator();

        while (i.hasNext()){
            System.out.println("Value : " + i.next());
        }

    }
}
