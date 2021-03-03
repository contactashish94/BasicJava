package com.ashish.oops.composition;

public class PC {
    private String thePC;
    private Monitor monitor;

    public PC(String thePC, Monitor monitor) {
        this.thePC = thePC;
        this.monitor = monitor;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
