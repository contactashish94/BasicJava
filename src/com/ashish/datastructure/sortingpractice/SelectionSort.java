package com.ashish.datastructure.sortingpractice;

public class SelectionSort {


    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }//end of method

    public static void main(String[] args) {
        int array[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};

        System.out.println("User entered Array: ");
        SelectionSort.printArray(array);

        long start = System.nanoTime();
        SelectionSort.selectionSort(array);
        long end = System.nanoTime();
        System.out.println("\n\nTime to execute this algo: " + (end - start));


        System.out.println("\n\nAfter sorting: ");
        SelectionSort.printArray(array);
    }

}
