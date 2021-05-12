package com.ashish.durgasoft.threading.deadlock.ex1;

public class B {
    public synchronized void m2(A a){
        System.out.println("B class m1");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){}
        a.last();
    }
    public synchronized void last(){
        System.out.println("B class last executed");
    }
}
