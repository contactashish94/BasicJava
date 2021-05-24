package com.ashish.interview.overload.ex1;

public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo = new Demo1();
        int i = 65;
        char j = 97;
        demo.m1(i,j);
    }

    public void m1(int a){
    }
    String m1(long a,long b){
        System.out.println("execute one");
        System.out.println(a+"---"+b);
        return null;
    }

    String m1(int a,byte b){
        System.out.println(a+"..."+b);
        return null;
    }
    String m1(char a,char b){
        System.out.println(a+"..."+b);
        return null;
    }
}
