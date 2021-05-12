package com.ashish.practice.java2blog;

import java.io.IOException;

class A1
{
    void m1() throws IOException
    {
        System.out.println("In m1 A");
    }
}
class B1 extends A1
{
    void m1() //throws //Exception
    {
        System.out.println("In m1 B");
    }
}
public class Test1 {

    public static void main(String[] args) {
        A1 a=new B1();
        try {
            a.m1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}