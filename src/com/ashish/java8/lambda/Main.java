package com.ashish.java8.lambda;

import java.util.function.Consumer;

public class Main {
	
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running from Anonymous inner class");
				
			}
		}).start();

	}

}