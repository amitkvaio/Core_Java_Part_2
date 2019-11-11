//Printing odd and even number using two thread and AtomicInteger.
package com.tricky01;

import java.util.concurrent.atomic.AtomicInteger;
public class I {
	static AtomicInteger atomicNumber = new AtomicInteger(1);
	public static void main(String[] args) {
		Runnable print = () -> {
			String thName = Thread.currentThread().getName();
			while (atomicNumber.get() < 40) {
				synchronized (atomicNumber) {
					if ((atomicNumber.get() % 2 == 0) && "Even".equals(thName)) {
						System.out.println(thName + ":" + atomicNumber.getAndIncrement());
					} else if ((atomicNumber.get() % 2 != 0) && "Odd".equals(thName)) {
						System.out.println(thName + ":" + atomicNumber.getAndIncrement());
					}
				}
			}
		};
		
		Thread t3 = new Thread(print,"Even");
		t3.start();
		Thread t4 = new Thread(print,"Odd");
		t4.start();
		System.out.println("done");
	}
}
