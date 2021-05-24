package com.ashish.datastructure.recursion.arrays;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        TwoDArray array= new TwoDArray(2,5);
        array.traverse2DArray();
        array.setValueAT(1,2,45);
        //array.setValueAT(9,25,455);
        System.out.println("value set --: ");
        System.out.println("value at --: "+array.valueAT(1,2));
        System.out.println(array.findIndex(45));
        System.out.println("------------------");
        array.deleteArray();
        System.out.println("After delete");
        array.traverse2DArray();
        //System.out.println(array.findIndex(455));
    }
}
