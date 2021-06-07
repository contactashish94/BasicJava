package com.ashish.datastructure.sortingpractice;

public class InsertionSort {
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i;
            while (j>0&& a[j - 1] > temp) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = temp;
            System.out.println("abc---");
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    public static void main(String[] args) {

        int array[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};

        System.out.println("User entered Array: ");
        InsertionSort.printArray(array);

        long start = System.nanoTime();
        InsertionSort.insertionSort(array);
        long end = System.nanoTime();
        System.out.println("\n\nTime to execute this algo: " + (end - start));

        System.out.println("\nAfter sorting: ");
        InsertionSort.printArray(array);
    }
}
