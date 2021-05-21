package com.ashish.datastructure.recursion.arrays;

import org.omg.CORBA.INTERNAL;

public class SingleDArray {
    int[] arr = null;

    public SingleDArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } catch (Exception e) {
        }
    }

    public void insert(int index, int valueToBeInserted) {
        try {
            if (arr[index] == Integer.MIN_VALUE) {
                arr[index] = valueToBeInserted;
                System.out.println("Inserted at : " + index);
            } else {
                System.out.println("Error while insertion as  cell already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of bounds exception --> ");
        }
    }

    public int get(int index) {
        try {
            if (arr[index] != Integer.MIN_VALUE) {
                return arr[index];
            } else {
                System.out.println("Blank Index");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Array Index Out of bounds exception from get method --> ");
        }
        return Integer.MIN_VALUE;
    }

    public int valueAt(int value) {
        try {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == value) {
                    return i;
                }
            }
        } catch (Exception e) {
        }
        return Integer.MIN_VALUE;
    }

    public void deleteValue(int value) {
        try {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == value) {
                    arr[i] = Integer.MIN_VALUE;
                    System.out.println("deleted at : " + i);
                }
            }
        } catch (Exception e) {
        }
    }

    public void deleteValueAt(int index) {
        try {
            arr[index] = Integer.MIN_VALUE;
            System.out.println("deleted at : " + index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException : while deleting");
        }
    }
}