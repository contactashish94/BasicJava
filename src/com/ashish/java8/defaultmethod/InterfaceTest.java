package com.ashish.java8.defaultmethod;

public interface InterfaceTest {
    public void m1();
    public void m2();
    public default void m3(){
        System.out.println("Interface");
    }
    public static void m4(){
        System.out.println("Static method");
    }
}
