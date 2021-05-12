package com.ashish.durgasoft.threading.threadpriority.ex1;

public class MyThread {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(11);
        System.out.println("After 11");
    }
}
