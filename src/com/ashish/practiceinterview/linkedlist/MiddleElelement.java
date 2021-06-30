package com.ashish.practiceinterview.linkedlist;

import java.util.LinkedList;

public class MiddleElelement {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        int midIndex = (list.size()/2)-1;
        System.out.println(list.get(midIndex));
        Object a = list.getLast();
        System.out.println(a.toString());
    }
}
