package com.ashish.interview.override.ex1;

public class Child extends ParentA {

    @Override
    public void m1() {
        System.out.println("Child-m1");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.m1();
    }
}
