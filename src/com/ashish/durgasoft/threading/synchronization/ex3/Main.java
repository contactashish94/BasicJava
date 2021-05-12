package com.ashish.durgasoft.threading.synchronization.ex3;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display();
       // Display d2 = new Display();
        MyThread t1 = new MyThread(d1);
        MyThread2 t2 = new MyThread2(d1);
        t1.start();
        t2.start();
    }
}
