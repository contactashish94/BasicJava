package com.ashish.test.serializable;

import jdk.nashorn.internal.ir.CatchNode;

import java.io.Serializable;

public class Dog implements Serializable {

    int i = 10;
    transient final int j = 20;

    Cat c = new Cat();
}
