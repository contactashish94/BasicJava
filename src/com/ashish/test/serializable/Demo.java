package com.ashish.test.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {
    public static void main(String[] args) throws Exception {
        Dog d1 = new Dog();
        System.out.println(d1.i);
        System.out.println(d1.j);

        FileOutputStream fos = new FileOutputStream("abcd.ser");
        ObjectOutputStream oo = new ObjectOutputStream(fos);
        oo.writeObject(d1);

        FileInputStream fis = new FileInputStream("abcd.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d= (Dog) ois.readObject();
        System.out.println("After deserialization");
        System.out.println(d.i);
        System.out.println(d.j);

        System.out.println("After deserialization---");
        System.out.println(d.c.x);


    }
}
