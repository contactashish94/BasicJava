package com.ashish.datastructure.practice.linkedlist;

public class MyLL {
    private int size;
    private MyLLNode head;
    private MyLLNode tail;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MyLLNode getHead() {
        return head;
    }

    public void setHead(MyLLNode head) {
        this.head = head;
    }

    public MyLLNode getTail() {
        return tail;
    }

    public void setTail(MyLLNode tail) {
        this.tail = tail;
    }

    public void createLL(int nodeValue) {
        head = new MyLLNode();
        MyLLNode newNode = new MyLLNode();
        newNode.setValue(nodeValue);
        newNode.setNext(null);
        head = tail = newNode;
    }

    private boolean exists() {
        return head != null;
    }

    public void insertInToLL(int location, int value) {
        MyLLNode newNode = new MyLLNode();
        newNode.setValue(value);
        if (!exists()) {
            System.out.println("No Linked List Found for insertion for location : " + location + " & value " + value);
        } else if (location == 0) {
            newNode.setNext(head);
            head = newNode;
        } else if (location >= size) {
            newNode.setNext(null);
            tail.setNext(newNode);
            tail = newNode;
        } else {
            MyLLNode tmpNode = head;
            int tmpIndex = 0;
            while (tmpIndex < location - 1) {
                tmpNode = tmpNode.getNext();
            }
            MyLLNode newNextNode = tmpNode.getNext();
            tmpNode.setNext(newNode);
            newNode.setNext(newNextNode);
        }
        setSize(getSize() + 1);
    }

    public void traverseList() {
        if (!exists()) {
            System.out.println("List Not found for traversal");
        } else {
            MyLLNode tmpNode = head;
            for (int i = 0; i <= getSize(); i++) {
                System.out.println(tmpNode.getValue());
                tmpNode = tmpNode.getNext();
            }
        }
    }

    public int findIndex(int nodeValue) {
        MyLLNode tmpNode = head;
        for (int i = 0; i <= getSize(); i++) {
            //System.out.println("for block execute no : " + i);
            if (nodeValue == tmpNode.getValue()) {
                System.out.println("if block execute no : " + i);
                return i;
            }
            tmpNode = tmpNode.getNext();
        }
        System.out.println("Value not found for index return");
        return Integer.MIN_VALUE;
    }
    public void deleteList() {
        if (!exists()) {
            System.out.println("List Not found for traversal");
        } else {
            head = null;
            tail = null;
            setSize(0);
        }
    }
}