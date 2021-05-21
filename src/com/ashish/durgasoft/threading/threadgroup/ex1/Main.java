package com.ashish.durgasoft.threading.threadgroup.ex1;

import java.util.concurrent.locks.ReentrantLock;

public class Main extends ReentrantLock {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getParent());

        ThreadGroup g1 = new ThreadGroup("tg");
        Thread t1 = new Thread(g1, "First");
        Thread t2 = new Thread(g1, "Second");
        g1.setMaxPriority(3);
        Thread t3 = new Thread(g1,"third");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

    }
}
