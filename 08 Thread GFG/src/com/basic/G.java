// Java program to illustrate Join() method in Java 
package com.basic;

public class G extends Thread {
	@Override
	public void run() {
		Thread ct = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(ct.getName() + " Running--");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread mt = Thread.currentThread();
		G g = new G();
		g.start();
		// Main thread will join the execution after 5 second
		System.out.println("Main Thread will join after 5 second");
		mt.join(5000);
		for (int i = 0; i < 5; i++) {
			 System.out.println(mt.getName() +" Running--");
		}
	}
	
	
}
