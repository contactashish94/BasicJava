package com.ashish.datastructure.mystack;

public class MyStackByArray {

    private int topOfStack;
    private int[] arr;

    public MyStackByArray(int size){
        this.arr=new int[size];
        this.topOfStack=-1;
        System.out.println("Stack created with :  = " + size + "cells");
    }
    public void push(int number){
        if(isStackFull()){
            System.out.println("Error while insertion : Stack Full");
        } else {
            arr[topOfStack+1]=number;
            topOfStack++;
            System.out.println("Successfully inserted " + number + " in the stack");
        }

    }

    public void pop(){
        if (isStackEmpty()){
            System.out.println("Stack Empty");
        } else {
            System.out.println("Removing : " + arr[topOfStack] + " From the stack");
            topOfStack--;
        }
    }

    public void peek(){
        if(isStackEmpty()){
            System.out.println("Empty Stack");
        } else {
            System.out.println("Top of the stack is : " + arr[topOfStack]);
        }
    }

    private boolean isStackFull(){
        return topOfStack == arr.length-1;
    }
    public boolean isStackEmpty(){
        return topOfStack == -1;
    }
    public void deleteStack(){
        arr = null;
        System.out.println("Stack Deleted");
    }


}
