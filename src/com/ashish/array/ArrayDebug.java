package com.ashish.array;

import java.util.Arrays;

public class ArrayDebug {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = arr;


        System.out.println("first array ref" + Arrays.toString(arr));
        System.out.println("second array ref" + Arrays.toString(arr1));

        arr1[0] = 1;

        System.out.println("first array ref after" + Arrays.toString(arr));
        System.out.println("second array ref after" + Arrays.toString(arr1));

        modify(arr);

        System.out.println("first array ref after modify" + Arrays.toString(arr));
        System.out.println("second array ref after modify" + Arrays.toString(arr1));
    }

    private static void modify(int[] array){
        array[4] = 2;

        array = new int[] {1,2,3,4,5};
    }


}
