package com.ashish.reference;

public class Main {
    public static void main(String[] args) {
        House bluehouse = new House("blue");
        System.out.println(bluehouse.getColour());

        House another = bluehouse;

        another.setColour("red");
        System.out.println(another.getColour());

        System.out.println(bluehouse.getColour());
    }
}
