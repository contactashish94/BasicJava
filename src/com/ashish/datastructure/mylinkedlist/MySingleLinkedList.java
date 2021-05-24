package com.ashish.datastructure.mylinkedlist;

import com.ashish.datastructure.mylinkedlist.MySingleNode;

public class MySingleLinkedList {

    private MySingleNode head;
    private MySingleNode tail;
    private int size;

    public MySingleNode getHead() {
        return head;
    }

    public void setHead(MySingleNode head) {
        this.head = head;
    }

    public MySingleNode getTail() {
        return tail;
    }

    public void setTail(MySingleNode tail) {
        this.tail = tail;
    }

    public MySingleNode createFirstLinkedList(int nodeValue) {
        head = new MySingleNode();
        MySingleNode node = new MySingleNode();
        node.setValue(nodeValue);
        node.setNext(null);
        head = tail = node;
        size = 1;
        return head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void insertInMyLinkedList(int nodeValue, int index) {
        MySingleNode newNode = new MySingleNode();
        newNode.setValue(nodeValue);
        if (!existsLinkedList()) {
            System.out.println("The linked list does not exist!!");
            return;
        } else if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else if (index >= getSize()) {
            newNode.setNext(null);
            tail.setNext(newNode);
            tail = newNode;
        } else {
            MySingleNode tmpNode = head;
            int tmpIndex = 0;
            while (tmpIndex < index - 1) {
                tmpNode = tmpNode.getNext();
                tmpIndex++;
            }
            MySingleNode nextNode = tmpNode.getNext();
            tmpNode.setNext(newNode);
            newNode.setNext(nextNode);
        }
        setSize(getSize() + 1);
    }

    private boolean existsLinkedList() {
        return head != null;
    }

    public void traverseMyLinkedList(){
        if(existsLinkedList()){
            System.out.println("Traversing");
            MySingleNode tempNode = head;
            for (int i = 0; i < getSize();i++){
                System.out.println(tempNode.getValue());
                tempNode = tempNode.getNext();
            }
            System.out.println("Traversing end");
        }
        else
            System.out.println("Linked list Not found");
    }

    public void deleteMyLinkedList(){
        if (!existsLinkedList()){
            System.out.println("The mentioned linked-list does not exist for deletion");
        }
        else {
            head=null;
            tail = null;
            System.out.println("Linked list Deleted Successfully");
            setSize(0);
        }
    }

    public boolean searchNodeValue(int nodeValue){
        if(existsLinkedList()){
            MySingleNode tempNode = head;
            for (int i = 0; i < getSize();i++){
                if(tempNode.getValue()==nodeValue){
                    return true;
                }
                tempNode = tempNode.getNext();
            }
        }
        else System.out.println("Linked not found for searching");
        return false;
    }
    public void deleteNodeFromLocation(int location){
        if (!existsLinkedList()) {
            System.out.println("The linked list does not exist!!");
            return;
        } else if (location == 0) {
            head = head.getNext();
            setSize(getSize()-1);
            if (getSize()==0){
                tail = null;
            }
        } else if (location >= getSize()) {
            MySingleNode tempNode = head;
            for(int i = 0; i < getSize()-1;i++){
                tempNode = tempNode.getNext();
            }
            if (tempNode==head){
                head=tail=null;
                setSize(getSize()-1);
                return;
            }
            tempNode.setNext(null);
            tail=tempNode;
            setSize(getSize()-1);
        }
        else {
            MySingleNode tempNode = head;
            for(int i = 0 ; i < location-1;i++){
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            setSize(getSize()-1);
        }
    }
}
