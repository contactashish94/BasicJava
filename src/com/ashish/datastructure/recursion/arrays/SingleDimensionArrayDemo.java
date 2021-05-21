package com.ashish.datastructure.recursion.arrays;

public class SingleDimensionArrayDemo {
    public static void main(String[] args) {
        SingleDArray array = new SingleDArray(10);
        array.traverseArray();
        array.insert(5,78);
        array.insert(5,100);
        array.traverseArray();

        System.out.println(array.get(55));
        System.out.println("value at ---> "+array.valueAt(78));
        array.deleteValue(78);
        System.out.println("value at ---> "+array.valueAt(78));
    }
}
