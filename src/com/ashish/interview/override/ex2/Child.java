package com.ashish.interview.override.ex2;

public class Child extends ParentB {

    @Override
    protected String m1() {
        System.out.println("Child-m1");
        return "";
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.m1();
    }
}
