package com.ashish.datastructure.practice.doubledlinkedlist;

public class MyDoubleLinkedList {
    private int size;
    private MyDoubleNode head;
    private MyDoubleNode tail;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MyDoubleNode getHead() {
        return head;
    }

    public void setHead(MyDoubleNode head) {
        this.head = head;
    }

    public MyDoubleNode getTail() {
        return tail;
    }

    public void setTail(MyDoubleNode tail) {
        this.tail = tail;
    }

    public void createDoubleLinkedList(int nodeValue){
        head = new MyDoubleNode();
        MyDoubleNode firstNode = new MyDoubleNode();
        firstNode.setValue(nodeValue);
        firstNode.setNext(null);
        firstNode.setPrev(null);
        head=firstNode;
        tail=firstNode;
        size = 1;
    }


    public boolean exists(){
        return head!= null;
    }

    public void addElement(int location, int nodeValue){
        MyDoubleNode newNode = new MyDoubleNode();
        newNode.setValue(nodeValue);
        if(!exists()){
            System.out.println("No List found for insertion");
            return;
        } else if(location ==0){
            newNode.setNext(head);
            newNode.setPrev(null);
            head.setPrev(null);
            head = newNode;
        } else if(location>=getSize()){
            newNode.setNext(null);
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail=newNode;
        } else {
            MyDoubleNode tmpNode = head;
            int index = 0;
            while (index<location-1){
                tmpNode = tmpNode.getNext();
                index++;
            }
            newNode.setNext(tmpNode.getNext());
            newNode.setPrev(tmpNode);
            tmpNode.setNext(newNode);
            newNode.getNext().setPrev(newNode);
        }
        setSize(getSize()+1);
    }
}
