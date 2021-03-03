package com.ashish.oops.composition;

public class Monitor {

    private String screenType;

    public void startMonitor(){
        System.out.println("Monitor is loading now...");
    }

    public Monitor(String screenType) {
        this.screenType = screenType;
    }


}
