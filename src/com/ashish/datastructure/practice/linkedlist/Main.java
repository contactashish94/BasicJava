package com.ashish.datastructure.practice.linkedlist;

public class Main {
    public static void main(String[] args) {
        MyLL list = new MyLL();
        list.createLL(10);
        list.insertInToLL(2,20);
        list.insertInToLL(3,30);
        list.insertInToLL(4,40);
        list.insertInToLL(5,50);
        list.insertInToLL(6,60);
        list.traverseList();
        System.out.println(list.findIndex(70));
    }
}
