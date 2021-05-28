package com.ashish.datastructure.udemy.queue.circularqueue;

public class MyCircularQueue {
    private int startIndex;
    private int topIndex;
    private int[] arr;
    private int size;

    public MyCircularQueue(int sizeOfQueue) {
        this.startIndex = -1;
        this.topIndex = -1;
        this.arr = new int[sizeOfQueue];
        this.size = sizeOfQueue;
    }

    public void enqueue(int value) {
        if (arr == null) {
            System.out.println("Null Queue : Initialize array first");
        } else if (isFull()) {
            System.out.println("Array Full");
        } else {
            if (startIndex == -1) {
                startIndex = 0;
            }
            if (topIndex + 1 == size) {
                topIndex = 0;
            } else {
                topIndex++;
            }
            arr[topIndex] = value;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Already Empty");
        } else {
            System.out.println("Dequeueing...");
            System.out.println("Array Before Dequeue...");
            printqueue();
            System.out.println("Dequeued: " + arr[startIndex] + " from queue");
            arr[startIndex] = 0;
            System.out.println("Array after Dequeue...");

            if (startIndex == topIndex) {
                startIndex = topIndex = -1;
            } else if (startIndex + 1 == size) {
                startIndex = 0;
            } else {
                startIndex++;
            }
            printqueue();
        }
    }

    public boolean isFull() {
        if (topIndex + 1 == startIndex) return true;
        else if ((startIndex == 0) && (topIndex + 1 == size)) { //Trivial case of Queue being full
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    void printqueue() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nStartIndex : " + startIndex);
        System.out.println("EndIndex   : " + topIndex);
    }
}
