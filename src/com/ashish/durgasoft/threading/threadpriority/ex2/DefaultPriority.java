package com.ashish.durgasoft.threading.threadpriority.ex2;

public class DefaultPriority extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setPriority(2);
        System.out.println("Child thread default priority"+ Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(3);
        //System.out.println("Child-2 thread default priority"+ Thread.currentThread().getPriority());
    }
}
class Test {
    public static void main(String[] args) {
        DefaultPriority t1  = new DefaultPriority();
        Thread.currentThread().setPriority(9);
        //t1.setPriority(7);
        t1.start();

        System.out.println("Main thread default priority"+ Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(7);
        System.out.println(t1.getPriority());

    }
}