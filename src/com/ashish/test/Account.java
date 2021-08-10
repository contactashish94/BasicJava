package com.ashish.test;

import java.io.*;

public class Account implements Serializable {
    String name = "Ashish";
    transient String pwd = "AshishKumarTest";

    private void writeObject(ObjectOutputStream oos) throws Exception{
        oos.defaultWriteObject();
        String epwd = "123"+pwd;
        oos.writeObject(epwd);
    }
    private void readObject(ObjectInputStream ois) throws Exception {
        ois.defaultReadObject();
        String epwd = (String) ois.readObject();
        pwd = epwd.substring(3);
    }
}
class SerialDemo {
    public static void main(String[] args) throws Exception {
        Account a1 = new Account();

        FileOutputStream fos = new FileOutputStream("test.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis = new FileInputStream("test.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account a2 = (Account) ois.readObject();

        System.out.println("After Account.... " + a2.name + "---" + a2.pwd);
    }

}