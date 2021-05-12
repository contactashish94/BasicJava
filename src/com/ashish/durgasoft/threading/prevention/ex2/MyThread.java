package com.ashish.durgasoft.threading.prevention.ex2;

public class MyThread extends Thread {
    static Thread mt;
    @Override
    public void run() {
        try{
            mt.join();
        } catch (InterruptedException e){}
        for(int i = 0; i < 10;i++){
            System.out.println("Child execution");
        }
    }
}
class Main{
    public static void main(String[] args) throws InterruptedException {
        MyThread.mt = Thread.currentThread();
        MyThread t1 = new MyThread();
        //t1.start();
        //t1.join();
        Thread.currentThread().join();
        for(int i = 0; i<10;i++){
            System.out.println("Main execution");
            Thread.sleep(20);
        }
    }
}