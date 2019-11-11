package com.lara.pack21.atomic;

public class FWithoutAtomicInterger extends Thread {
	static int anInteger = 0; // initialize
	public static void main(String[] args) throws Exception {
		// employ 200 threads.
		for (int i = 0; i < 200; i++) {
			new FWithoutAtomicInterger().start();
		}
		// wait for some time so all 200 threads completes its execution.
		Thread.sleep(1000 * 6);
		System.out.println(anInteger); // We EXPECT TO PRINT 200. but it prints some corrupted integer value !!
	}

	public void run() {
		try {
			Thread.sleep(4000);
			anInteger += 1;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
