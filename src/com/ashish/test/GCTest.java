package com.ashish.test;

public class GCTest {
    public static void main(String[] args) throws Throwable {
        GCTest t = new GCTest();
        //t=null;
        //System.gc();
        t.finalize();
        for(int i = 0;i<10000;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("end of main");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized--locally");
        System.out.println(10/0);
        System.out.println("Finalized--locally...");
    }
}
