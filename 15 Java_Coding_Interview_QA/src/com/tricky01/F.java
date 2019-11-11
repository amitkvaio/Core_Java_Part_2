package com.tricky01;

public class F {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("AIC:"+i);
				}
			}
		}).start();
		simpleConceptWithRunnable();
	}
	
	private static void simpleConceptWithRunnable() {
		// boilerplate code which needs to be written everytime
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside annonymos inner class");
			}
		};

		Runnable runnable2 = () -> { // Lambda expression
			System.out.println("Inside lambda expression");
		};

		Thread thread = new Thread(runnable);
		thread.start();

		thread = new Thread(runnable2);
		thread.start();
	}
}




