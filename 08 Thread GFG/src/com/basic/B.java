//Thread creation by implementing the Runnable Interface
package com.basic;

public class B implements Runnable {
	
	 @Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName +" is running");
	}
	
	public static void main(String[] args) {
		B b = new B();
		for (int i = 1; i <= 10 ; i++) {
			Thread t = new Thread(b);
			t.start();
		}
	}
}
