package com.ashish.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDebug {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
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
