package com.ashish.richardlambda;

import java.awt.event.ActionListener;

public class Example1 {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("No args Printed");
        runnable.run();
    }
}
