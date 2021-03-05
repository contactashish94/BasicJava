package com.ashish.list.linkedlist;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.ListIterator;

public class SortedLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        sortOrder(list, "Delhi");
        sortOrder(list, "Mumbai");
        sortOrder(list, "Mumbai");
        sortOrder(list, "Ahmedabad");
        sortOrder(list, "Kolkata");
        sortOrder(list, "Patna");
        sortOrder(list, "Patna");

        System.out.println(list);



    }

    private  static boolean sortOrder(LinkedList<String>list, String newCity){

        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext()){
            int comparision = iterator.next().compareTo(newCity);
            if(comparision==0){
                System.out.println(newCity + " is already added , Equal");
                return false;
            }
            else if(comparision>0){
                iterator.previous();
                iterator.add(newCity);
                System.out.println("City added before");
                return true;
            }
            else if (comparision<0){
                System.out.println("City adding later");
            }
        }
        iterator.add(newCity);
        return true;
    }
}
