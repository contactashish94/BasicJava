package com.ashish.test.java8;

import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Emp> empp = EmpDB.getEmpList();
        long start=System.currentTimeMillis();
        empp.stream().forEach(i -> {
            //System.out.println("Stream value --> " + i.getName());
        });
        long end=System.currentTimeMillis();
        System.out.print("Normal Stream : " + (end-start));
        start=System.currentTimeMillis();
        empp.parallelStream().forEach(i -> {
            //System.out.println("ParallelStream value --> " + i.getName());
        });
        end=System.currentTimeMillis();
        System.out.println("Parallel Stream : " + (end-start));
    }
}
