//Printing odd and even number using two thread.
package com.tricky01;

public class H {
	static volatile int atomicNumber=1;
	public static void main(String[] args) {
		Runnable print = () -> {
			while (atomicNumber < 40) {
				print();
			}
		};
		Thread t1 = new Thread(print,"Even");
		t1.start();
		Thread t2 = new Thread(print,"Odd");
		t2.start();
	}
	
	public static synchronized void print() {
		String thName = Thread.currentThread().getName();
		if ((atomicNumber % 2 == 0) && "Even".equals(thName)) {
			System.out.println("Even" + ":" + atomicNumber);
			atomicNumber++;
		} else if ((atomicNumber % 2 != 0) && "Odd".equals(thName)) {
			System.out.println("Odd" + ":" + atomicNumber);
			atomicNumber++;
		}
	}
}
