package com.ashish.datastructure.mylinkedlist;

public class MySingleNode {
    private int value;
    private MySingleNode next;
    //private MySingleNode node;

    /*public MySingleNode() {

    }
    public MySingleNode(int value) {
        this.node.setValue(value);
    }*/

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MySingleNode getNext() {
        return next;
    }

    public void setNext(MySingleNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "value=" + value ;
    }
}