package com.ashish.test;

public class States {
    private String state;
    private String country;

    public States(String state) {
        this.state = state;
    }

    public States(String state, String country) {
        this.state = state;
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }
}
