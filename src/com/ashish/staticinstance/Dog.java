package com.ashish.staticinstance;

public class Dog {

    public static void bark(){
        System.out.println("Dog is barking");
    }

    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }
    public void printName(){
        System.out.println("the dog name is = " + name);
    }


}