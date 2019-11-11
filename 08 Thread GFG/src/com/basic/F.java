// Java program to illustrate sleep() method in Java 
package com.basic;

public class F extends Thread {
	
	@Override
	public void run() {
		Thread ct = Thread.currentThread();
		try {
				for (int i = 0; i < 5; i++) {
					System.out.println(ct.getName()+" is running ---");
					Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		F f1 = new F();
		F f2 = new F();
		f1.start();
		f2.start();
		System.out.println("Main method finished");
	}
}
