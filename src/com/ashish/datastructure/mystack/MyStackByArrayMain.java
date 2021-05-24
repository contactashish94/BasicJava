package com.ashish.datastructure.mystack;

import java.util.HashMap;
import java.util.Stack;

public class MyStackByArrayMain {
    public static void main(String[] args) {
        MyStackByArray stack = new MyStackByArray(10);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isStackEmpty());
        stack.push(100);
        System.out.println(stack.isStackEmpty());
        HashMap map = new HashMap();
    }
}
