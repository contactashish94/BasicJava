package com.ashish.oops.inheritance;

public class Animal {

    private int weight;
    private String name;

    public Animal(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    ///////////

    public void printValue(){
        System.out.println("Printed In super class");
    }

    //Dog dog1 = new Dog(123,"Jack");
}
