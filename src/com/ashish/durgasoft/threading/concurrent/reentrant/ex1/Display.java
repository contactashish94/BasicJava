package com.ashish.durgasoft.threading.concurrent.reentrant.ex1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Display {

    static ReentrantLock l = new ReentrantLock();

    public void wish(String name) throws InterruptedException{

        do {
            if (l.tryLock(2000, TimeUnit.MILLISECONDS)) {
                System.out.println(name + ":   ---Got Chance ---> " + System.currentTimeMillis());
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                }
                l.unlock();
                break;
            } else {
                System.out.println(name + ":----Waiting---> " + System.currentTimeMillis());
            }
        }while (true);
    }
}