package com.ashish.durgasoft.threading.executor.ex1;

public class PrintJob implements Runnable {

    String name;
    PrintJob(String name){
        this.name=name;
    }
    @Override
    public void run() {
        Thread.currentThread().setName(name);
        System.out.println(Thread.currentThread().getName() + " -- is executing");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        System.out.println(Thread.currentThread().getName() + " -- executed");
    }
}
