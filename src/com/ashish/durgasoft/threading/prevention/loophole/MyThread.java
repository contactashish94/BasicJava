package com.ashish.durgasoft.threading.prevention.loophole;

import com.ashish.java8.debugdefault.Child;



/* If the target thread is not in waiting state, still interrupt method is called then , ????*/
/* Interrupt call is not wasted, it keeps on waiting until the target thread goes to sleep/wait state...
                if not at all the execution will be smooth*/
/* if the target thread never went into sleep/wait state, that is the only situation when interrupt call is wasted*/

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Sleeping");
                //Thread.sleep(2000);
            }
        }catch (Exception e){
            System.out.println("Child disturbed");
        }
    }
}
class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        t1.interrupt();
        System.out.println("Main executed");
    }
}