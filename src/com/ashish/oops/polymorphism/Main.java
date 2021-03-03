package com.ashish.oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Movie movie = new DDLJ();
        Movie movie1 = new URI();
        Movie movie2 = new KKKG();

        System.out.println("Using DDLJ Object");
        movie.plot();
        System.out.println("Using URI Object");
        movie1.plot();
        System.out.println("Using KKKG Object");
        movie2.plot();
    }
}
