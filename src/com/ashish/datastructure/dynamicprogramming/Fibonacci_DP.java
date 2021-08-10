package com.ashish.datastructure.dynamicprogramming;

public class Fibonacci_DP {
	int memory[] = new int[10000000];

	public int CalculateFibonacci(int n) {

		if (n < 1) {
			System.out.println("Please enter a positive number"); 
			return Integer.MIN_VALUE;
		}else if (n == 1) {
			return 0;
		}else if (n == 2) {
			return 1;     
		}else  {
			if (memory[n]==0){
			memory[n] = CalculateFibonacci(n-1) + CalculateFibonacci(n-2);}
			return memory[n];
		}
	}// end of method

	
	public static void main(String[] args) {
		Fibonacci_DP fib = new Fibonacci_DP();
		//System.gc();
		//System.out.println("5th Fibonacci is ---> " + fib.CalculateFibonacci(5));
		//System.out.println("6th Fibonacci is ---> " + fib.CalculateFibonacci(6));
		//System.out.println("Print first 10 Fibonacci Numbers");
		Long start = System.nanoTime();

		for(int i = 1; i <=1000;i++){
			System.out.println("---"+i+"---  "+fib.CalculateFibonacci(i)+" ");

		}
		Long end = System.nanoTime();
		System.out.println();
		System.out.println("Total time to execute by Dynamic Programming: =" + (end-start));
	}// end of method

}// end of class
