package com.ashish.practice.java2blog.multithreading;

public class OddEven {

    boolean odd;
    int count = 1;
    int MAX = 20;

    public static void main(String[] args) {
        OddEven oe = new OddEven();
        oe.odd=true;

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                oe.printOdd();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                oe.printEven();
            }
        });


        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public void printEven(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        synchronized (this){
            while (count < MAX){
                while (odd){
                    try {
                        wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("Even Thread :" + count);
                count++;
                odd = true;
                notify();
            }
        }
    }
    public void printOdd() {
        synchronized (this) {
            while (count < MAX) {
                while (!odd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd Thread :" + count);
                count++;
                odd = false;
                notify();
            }
        }
    }


}
