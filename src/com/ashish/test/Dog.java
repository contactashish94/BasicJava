package com.ashish.test;

import java.io.*;

public class Dog implements Serializable {
    transient int i = 10;
    final int j  = 20;
}
class Demo {
    public static void main(String[] args) throws Exception {
        Dog d1 = new Dog();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog) ois.readObject();

        System.out.println("After deserial.... " + d2.i + "---" + d2.j);

        try(BufferedReader br = new BufferedReader(new FileReader(""))) {
            System.out.println("");
        } catch (Exception e){}
    }
}