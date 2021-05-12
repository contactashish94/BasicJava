package com.ashish.durgasoft.threading.threadcomm.ex2;

public class ThreadB extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println("Child --> " + i);
        }
        synchronized (this){
            this.notifyAll();
        }
    }
}
