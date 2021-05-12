package com.ashish.durgasoft.threading.synchronization.ex3;

public class MyThread2 extends Thread{
    Display d;
    MyThread2(Display d){
        this.d=d;
    }
    @Override
    public void run() {
        d.displayC();
    }
}
