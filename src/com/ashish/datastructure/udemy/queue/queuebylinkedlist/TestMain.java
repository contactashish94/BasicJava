package com.ashish.datastructure.udemy.queue.queuebylinkedlist;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.PriorityQueue;

public class TestMain  {

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();

        queue.add("abcd");

        HashMap<String, String> map = new HashMap<>();
        Hashtable table = new Hashtable();
        System.out.println(map.put("A", "V"));
        System.out.println(map);
    }


}
