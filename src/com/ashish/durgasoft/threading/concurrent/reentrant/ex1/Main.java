package com.ashish.durgasoft.threading.concurrent.reentrant.ex1;

public class Main {
    public static void main(String[] args) {
        Display d = new Display();
        //Display d2 = new Display();
        MyThread t1 = new MyThread(d, "Dhoni");
        MyThread t2 = new MyThread(d, "Yuvi");
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
