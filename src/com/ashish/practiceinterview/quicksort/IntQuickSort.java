package com.ashish.practiceinterview.quicksort;

public class IntQuickSort {
    public static void main(String[] args) {
        int[] a = {1, 4, 6, 7, 3, 44, 67, 89};
        IntQuickSort.quickSort(a, 0, a.length - 1);
        for (int i = 0; i <= a.length-1; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void quickSort(int[] a, int startIndex, int endIndex) {
        if(startIndex<endIndex){
            int pivot = partition(a, startIndex, endIndex);
            quickSort(a, startIndex, pivot - 1);
            quickSort(a, pivot + 1, endIndex);
        }
    }

    private static int partition(int[] a, int startIndex, int endIndex) {
        int pivot = endIndex;
        int i = startIndex-1;
        for (int j = startIndex; j <= endIndex; j++) {
            if (a[j] <= a[pivot]) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        return i;
    }
}
