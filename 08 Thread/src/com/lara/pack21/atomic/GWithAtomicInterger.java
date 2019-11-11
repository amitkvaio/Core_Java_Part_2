package com.lara.pack21.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class GWithAtomicInterger extends Thread {
	static AtomicInteger anInteger = new AtomicInteger(); // initialize
	public static void main(String[] args) throws Exception {
		// employ 200 threads.
		for (int i = 0; i < 200; i++) {
			new GWithAtomicInterger().start();
		}
		// wait for some time so all 200 threads completes its execution.
		Thread.sleep(1000 * 6);
		System.out.println(anInteger); 
		// We EXPECT TO PRINT 200 and its printing 200 !!
	}

	public void run() {
		try {
			Thread.sleep(4000);
			anInteger.getAndIncrement();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
