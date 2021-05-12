package com.ashish.durgasoft.threading.threadcomm.ex1;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        t1.start();
        Thread.sleep(100);
        System.out.println("Main Thread expecting updation");
        synchronized (t1){
            t1.wait();
        }
        System.out.println("Main Thread got notification");
        System.out.println(t1.total);
    }
}
