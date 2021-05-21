package com.ashish.interview.singleton.ex1;

public final class SingletonDemo1 {
    private static SingletonDemo1 instance = new SingletonDemo1();

    public static SingletonDemo1 getInstance(){
        return instance;
    }
    void show(){
        System.out.println("Called using getInstance");
    }
}
