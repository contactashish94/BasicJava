package com.ashish.durgasoft.threading.synchronization.ex2;

public class MyThread extends Thread {
    Display d;
    String name;
    MyThread(Display d, String name){
        this.d=d;
        this.name=name;
    }
    @Override
    public void run() {
        //d.wish(name);
        //System.out.println(d);
        d.wishSynchMorning(name);
    }
}
