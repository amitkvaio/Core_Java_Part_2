//Java program to demonstrate deadlock using Main thread 
package com.basic;

public class D {
	public static void main(String[] args) {
		System.out.println("Entering into the DeadLock");
		try {
			Thread mt = Thread.currentThread();
			mt.join();
			
			// the following statement will never execute 
            System.out.println("This statement will never execute"); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
