package com.ashish.durgasoft.threading.prevention;

public class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){

            System.out.println("Child -> " + i);
            Thread.yield();
        }
    }
}
class MyThread1 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Child_1 -> " + i);
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            System.out.println("Child_2 -> " + i);
        }
    }
}
class MyThread3 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            System.out.println("Child_3 -> " + i);
        }
    }
}
class MyThread4 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            System.out.println("Child_4 -> " + i);
        }
    }
}
class MyThread5 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            Thread.yield();
            System.out.println("Child_5 -> " + i);
        }
    }
}
class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        MyThread1 t1 = new MyThread1();
        /*MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        MyThread4 t4 = new MyThread4();
        MyThread5 t5 = new MyThread5();*/

        t.start();
       t1.start();
       try{
           t.join();
       }catch (InterruptedException e){

       }
        /* t2.start();
        t3.start();
        t4.start();
        t5.start();*/

       for (int i =0;i <10;i++){
           System.out.println("Main");
       }
    }
}