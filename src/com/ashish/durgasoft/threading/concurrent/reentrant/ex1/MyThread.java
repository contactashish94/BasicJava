package com.ashish.durgasoft.threading.concurrent.reentrant.ex1;

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
        try {
            d.wish(name);
        }catch (InterruptedException e){}
    }
}
