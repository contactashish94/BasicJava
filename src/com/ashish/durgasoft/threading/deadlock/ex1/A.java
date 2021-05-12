package com.ashish.durgasoft.threading.deadlock.ex1;

public class A {
    public synchronized void m1(B b){
        System.out.println("A class m1");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){}
        b.last();
    }
    public synchronized void last(){
        System.out.println("A class last executed");
    }
}
