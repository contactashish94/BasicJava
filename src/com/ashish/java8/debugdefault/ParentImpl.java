package com.ashish.java8.debugdefault;

public class ParentImpl implements Parent {
    @Override
    public void welcome() {
        message("Parent Impl");
    }

    private String body;

    @Override
    public void message(String body) {
        this.body = body;
    }

    @Override
    public String getLastMessage() {
        return body;
    }
}
