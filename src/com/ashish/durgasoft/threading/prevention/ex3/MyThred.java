package com.ashish.durgasoft.threading.prevention.ex3;


public class MyThred extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Sleping");
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println("Child disturbed");
        }
    }
}

class Main{
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setPriority(1);
        System.out.println(Thread.currentThread().getPriority());
        MyThred t1 = new MyThred();
        t1.start();
        //t1.interrupt();
        System.out.println("Main execution");
    }
}
