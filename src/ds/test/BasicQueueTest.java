package ds.test;

import ds.BasicQueue;

public class BasicQueueTest {
    public static void main(String[] args) {
        BasicQueue<String> queue = new BasicQueue<>();
        queue.enQueue("Hello");
        System.out.println(queue.accessItemAt(0));
    }
}
