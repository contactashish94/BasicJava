package com.ashish.practice.java2blog;

import java.util.HashSet;

public class Customer {

    String name;
    int age;

    Customer(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) {

        Customer c1= new Customer("John",20);
        Customer c2= new Customer("John",20);

        HashSet<Customer> customerSet=new HashSet<>();
        customerSet.add(c1);
        customerSet.add(c1);
        //System.out.println(c1);
        //System.out.println(c2);
        System.out.println(customerSet.size());
        /*for (Customer c : customerSet) {
            System.out.println(c.name);
        }*/
    }

    // getters and setters
}