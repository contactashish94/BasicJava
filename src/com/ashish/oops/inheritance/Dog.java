package com.ashish.oops.inheritance;

public class Dog extends Animal {

    public Dog(int weight, String name) {
        super(weight, name);
    }
    public void printValue(){

        System.out.println("Printed in sub class");
        super.printValue();
    }
}
