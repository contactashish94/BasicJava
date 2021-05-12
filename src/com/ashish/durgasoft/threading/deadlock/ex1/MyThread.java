package com.ashish.durgasoft.threading.deadlock.ex1;

public class MyThread extends Thread {
    A a = new A();
    B b = new B();
    @Override
    public void run() {
        b.m2(a);
    }
    public void m1(){
        this.start();
        a.m1(b);
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.m1();
    }
}
