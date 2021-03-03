package com.ashish.oops.composition;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("HD Screen");
        PC thePc = new PC("Dell", monitor);

        thePc.getMonitor().startMonitor();

    }
}
