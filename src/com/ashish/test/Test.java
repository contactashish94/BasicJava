package com.ashish.test;

import java.io.Serializable;

public abstract class Test {
    public void m1(){

    }
    abstract public void m2();
}
class Test2 extends Test {
    @Override
    public void m2() {

    }

    public static void main(String[] args) {
        Test2 t1 = new Test2();
        t1.m2();
    }
}
class Test3 implements Serializable {

}