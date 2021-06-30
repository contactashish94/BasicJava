package com.ashish.datastructure.divideandconquer;

public class Fibonacci_DC {

	public int CalculateFibonacci(int n) {
		//System.gc();
		if (n < 1) {
			System.out.println("Please enter a positive number"); 
			return Integer.MIN_VALUE;
		}else if (n == 1) {
			return 0;
		}else if (n == 2) {
			return 1;     
		}else  {
			//System.gc();
			return CalculateFibonacci(n-1) + CalculateFibonacci(n-2);
		}
	}// end of method

	
	public static void main(String[] args) {
		Fibonacci_DC fib = new Fibonacci_DC();
		//System.gc();
		//System.out.println("5th Fibonacci is ---> " + fib.CalculateFibonacci(5));
		//System.out.println("6th Fibonacci is ---> " + fib.CalculateFibonacci(6));
		//System.out.println("Print first 10 Fibonacci Numbers");
		Long start = System.nanoTime();
		//System.gc();
		for(int i = 1; i <=10000000;i++){
			//System.gc();
			System.out.print(fib.CalculateFibonacci(i)+" ");
			//System.gc();
		}
		Long end = System.nanoTime();
		System.out.println();
		System.out.println("Total time to execute by Divide and conquer: =" + (end-start));
	}// end of method

}// end of class
