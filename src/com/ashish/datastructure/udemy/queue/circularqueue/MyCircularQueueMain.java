package com.ashish.datastructure.udemy.queue.circularqueue;

public class MyCircularQueueMain {
    public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(5);
        for (int i = 1; i <= 5;i++){
            queue.enqueue(i*10);
        }
        queue.printqueue();
        queue.enqueue(60);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(60);
    }
}
