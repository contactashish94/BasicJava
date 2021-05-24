package com.ashish.datastructure.practice.doubledlinkedlist;

public class MyDoubleNode {
    private int value;
    private MyDoubleNode next;
    private MyDoubleNode prev;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyDoubleNode getNext() {
        return next;
    }

    public void setNext(MyDoubleNode next) {
        this.next = next;
    }

    public MyDoubleNode getPrev() {
        return prev;
    }

    public void setPrev(MyDoubleNode prev) {
        this.prev = prev;
    }
}
