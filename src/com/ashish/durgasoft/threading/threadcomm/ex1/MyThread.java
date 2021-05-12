package com.ashish.durgasoft.threading.threadcomm.ex1;

public class MyThread extends Thread {
    int total = 0;
    @Override
    public void run() {
        System.out.println("Child Thread Starts Calculation");
        for(int i = 1; i <=100;i++){
            total = total + i;
        }
        System.out.println("Child Thread Calculation finish, notification sending");
        synchronized (this){
            this.notify();
        }
    }
}
