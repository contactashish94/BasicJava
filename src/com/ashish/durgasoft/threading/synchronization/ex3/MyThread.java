package com.ashish.durgasoft.threading.synchronization.ex3;

public class MyThread extends Thread {
    Display d;
    MyThread(Display d){
        this.d=d;
    }
    @Override
    public void run() {
        d.displayN();
    }
}
