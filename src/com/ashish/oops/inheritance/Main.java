package com.ashish.oops.inheritance;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(20, "Harry");

        System.out.println(dog.getName());
        System.out.println(dog.getWeight());


        dog.printValue();
    }
}
