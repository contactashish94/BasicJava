package com.ashish.staticinstance;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        Dog dog = new Dog("Harry");
        Dog dog1 = new Dog("Fluffy");
        dog.printName();
        dog1.printName();


    }
}