package com.ashish.constructor;

public class VipPerson {

    private String name;
    private double limit;
    private String emailID;

    public VipPerson(){
        this("default", 123.45, "unknown");
    }

    public VipPerson(String name, double limit) {
        this(name,limit, "unknown1 ");
    }

    public VipPerson(String name, double limit, String emailID){
        this.name = name;
        this.limit = limit;
        this.emailID = emailID;
    }
}
