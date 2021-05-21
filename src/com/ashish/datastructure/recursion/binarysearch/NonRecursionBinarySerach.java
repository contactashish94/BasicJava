package com.ashish.datastructure.recursion.binarysearch;

public class NonRecursionBinarySerach {
    public static void main(String[] args) {
        NonRecursionBinarySerach binary = new NonRecursionBinarySerach();
        int[] arr = {10, 20, 30, 40, 50, 60};
        binary.indexFinderFromArray(20, arr, 0, arr.length - 1);
    }

    static void indexFinderFromArray(int value, int[] arr, int startIndex, int lastIndex) {
        int midIndex = (startIndex + lastIndex) / 2;
        while (startIndex <= lastIndex) {
            if (arr[midIndex] == value) {
                System.out.println("Value at index : " + midIndex);
                break;
            } else if (arr[midIndex] < value) {
                startIndex = midIndex + 1;
            } else {
                lastIndex = midIndex - 1;
            }
            midIndex = (startIndex + lastIndex) / 2;
        }
        if (startIndex > lastIndex) {
            System.out.println("Element Not Found");
        }
    }
}
