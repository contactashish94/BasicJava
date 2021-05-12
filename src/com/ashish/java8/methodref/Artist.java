package com.ashish.java8.methodref;

public class Artist {

    String name;
    String location;

    public Artist(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
