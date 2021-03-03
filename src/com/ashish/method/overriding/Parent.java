package com.ashish.method.overriding;

public class Parent {

    protected Object hello(String str){
        return "hello";
    }

    public Object overloadTest(String str,int a){
        return "hello";
    }
}
