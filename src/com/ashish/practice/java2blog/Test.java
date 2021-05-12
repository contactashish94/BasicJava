package com.ashish.practice.java2blog;

class A
{
    void m1() throws Exception {
        System.out.println("In m1 A");
    }
    void m2()
    {
        System.out.println("In m2 A");
    }
}
class B extends A
{
    void m1()
    {
        System.out.println("In m1 B");
    }
    void m2()
    {
        System.out.println("In m2 B");
    }
}
public class Test {

    public static void main(String[] args) {
        A a=new B();
        a.m2();
    }
}