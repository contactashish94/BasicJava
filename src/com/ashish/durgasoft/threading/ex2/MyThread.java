package com.ashish.durgasoft.threading.ex2;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread");
    }
}
class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("Main---");
        t1.start();
    }
}