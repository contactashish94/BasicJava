package com.ashish.java8.debugdefault;

public class Main {

    public static void main(String[] args) {
        Parent parent = new ParentImpl();
        parent.welcome();
        String str = parent.getLastMessage();
        System.out.println(str);
        System.out.println("---------------------------------------------");
        Child child = new ChildImpl();
        child.welcome();
        String str1 = parent.getLastMessage();
        System.out.println(str1);
    }
}
