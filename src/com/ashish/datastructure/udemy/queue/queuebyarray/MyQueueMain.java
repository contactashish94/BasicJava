package com.ashish.datastructure.udemy.queue.queuebyarray;

public class MyQueueMain {
    public static void main(String[] args) {
        MyQueueByArray queue = new MyQueueByArray(10);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        queue.printQueue();
    }
}
