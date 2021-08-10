package com.ashish.datastructure.divideandconquer;

public class Number_Factors_DC {

	public int waysToGetN(int n) {
		if ((n == 0) || (n == 1) || (n == 2)) // { }, {1}, {1,1}
			return 1; //
		if (n == 3)
			return 2; // {1,1,1}, {3}

		int subtract1 = waysToGetN(n - 1); // if we subtract 1, we will be left with 'n-1'
		int subtract3 = waysToGetN(n - 3); // if we subtract 3, we will be left with 'n-3'
		int subtract4 = waysToGetN(n - 4); // if we subtract 4, we will be left with 'n-4'

		return subtract1 + subtract3 + subtract4;
	}//End of method

	
	public static void main(String[] args) {
		Number_Factors_DC en = new Number_Factors_DC();
		Long start = System.nanoTime();

		System.out.println(en.waysToGetN(4));
		System.out.println(en.waysToGetN(5));
		System.out.println(en.waysToGetN(6));
		System.out.println(en.waysToGetN(30));
		Long end = System.nanoTime();

		System.out.println();
		System.out.println("Total time to execute by D & C: =" + (end-start));
	}//End of method
	
	
}//End of Class
