package com.ashish.durgasoft.threading.deadlock.ex1;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        A a = new A();
        B b = new B();
        b.m2(a);
    }
}
