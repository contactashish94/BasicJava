package com.ashish.durgasoft.threading.executor.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        PrintJob[] pr = {new PrintJob("ABCD"),
                new PrintJob("Ashish"),
                new PrintJob("Kumar"),
                new PrintJob("Shubham")};

        ExecutorService ex = Executors.newFixedThreadPool(4);
        for (PrintJob job: pr ) {
            ex.submit(job);
        }
        ex.shutdown();
    }
}
