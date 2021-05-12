package com.ashish.durgasoft.threading.ex3;

public class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("after t start --> " + Thread.currentThread().getName());
        System.out.println("By Runnable");
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("name main --> " + Thread.currentThread().getName());
        MyThread t1 =  new MyThread();
        Thread t2 = new Thread(t1);
        System.out.println("from Object --> " + t2.getName());
        System.out.println("Main execution");
    }
}