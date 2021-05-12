package com.ashish.durgasoft.threading.threadcomm.ex2;

public class ThreadA {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        ThreadB b1 = new ThreadB();
        ThreadB b2 = new ThreadB();
        ThreadB b3 = new ThreadB();
        ThreadB b4 = new ThreadB();

        System.out.println("Main entering to wait");
        synchronized (b){
            System.out.println("Waiting state--1");
            b.wait(5000);
            System.out.println("main Executed 1");
        }
        synchronized (b1){
            System.out.println("Waiting state--2");
            b1.wait(5000);
            System.out.println("main Executed 2");
        }
        b.start();
    }
}
