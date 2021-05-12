package com.ashish.durgasoft.threading.threadpriority.ex3;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i<10;i++){
            //System.out.println("Childthread priority -> " + Thread.currentThread().getPriority());
            System.out.println("Child --> " + i);
        }
    }
}
class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setPriority(10);
        t1.start();
        for (int i =0 ; i < 10; i++){
            //System.out.println("Mainthread priority -> " + Thread.currentThread().getPriority());
            System.out.println("Main -> " + i);
        }
    }
}
