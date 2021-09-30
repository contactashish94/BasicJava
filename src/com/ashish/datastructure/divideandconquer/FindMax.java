package com.ashish.datastructure.divideandconquer;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {8,7,1};

        int max = DAC_Max(arr, 0, arr.length);
        System.out.println("Max Number : = " + max);
    }


    static int DAC_Max(int a[], int index, int sizeOfArray) {
        System.out.println("Method execution");
        int max;

        if (index >= sizeOfArray - 2) {
            if (a[index] > a[index + 1])
                return a[index];
            else
                return a[index + 1];
        }

        // Logic to find the Maximum element
        // in the given array.
        max = DAC_Max(a, index + 1, sizeOfArray);
        if (a[index] > max)
            return a[index];
        else
            return max;
    }
}
