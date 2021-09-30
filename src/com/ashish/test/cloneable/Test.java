package com.ashish.test.cloneable;

import java.util.ArrayList;

public class Test implements Cloneable {
    int i = 10;
    int j = 20;
    public static void main(String[] args)  {
        Test t = new Test();
        ArrayList l = new ArrayList();
        try{
            Test t1 = (Test) t.clone();
        } catch (Exception e){
           // System.out.println();
            e.printStackTrace();
        }

    }
}
