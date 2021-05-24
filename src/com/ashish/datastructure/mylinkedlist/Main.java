package com.ashish.datastructure.mylinkedlist;

public class Main {
    public static void main(String[] args) {
        MySingleLinkedList list = new MySingleLinkedList();
        list.createFirstLinkedList(10);
        System.out.println(list.getSize());
        list.insertInMyLinkedList(4,2);
        list.insertInMyLinkedList(5,3);
        list.insertInMyLinkedList(6,4);
        list.insertInMyLinkedList(7,5);
        list.insertInMyLinkedList(8,6);
        list.insertInMyLinkedList(9,4);
        list.traverseMyLinkedList();
        list.deleteMyLinkedList();
        //list.traverseMyLinkedList();
        list.deleteMyLinkedList();
        System.out.println(list.getSize());
    }
}
