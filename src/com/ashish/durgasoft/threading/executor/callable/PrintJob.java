package com.ashish.durgasoft.threading.executor.callable;

import java.util.concurrent.Callable;

public class PrintJob implements Callable {

    String name;
    int sum = 0;
    PrintJob(String name){
        this.name=name;
    }
    @Override
    public Object call() {
        Thread.currentThread().setName(name);
        System.out.println(Thread.currentThread().getName() + " -- is executing");
        for(int i = 0;i<100;i++){

        }
        System.out.println(Thread.currentThread().getName() + " -- executed");
        return new Object();
    }
}
