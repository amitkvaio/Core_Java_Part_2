package com.lara.pack22.semaphore;

import java.util.concurrent.Semaphore;

public class MyThread extends Thread {
	Semaphore semaphore;

	MyThread(Semaphore semaphore) {
		this.semaphore = semaphore;
	}

	public void run() {
		try {
			semaphore.acquire();
			System.out.println("Hello " + this.getName());
			sleep(2000);
		} catch (InterruptedException ie) {
		} finally {
			semaphore.release();
			System.out.println("Goodbye " + this.getName());
		}
	}
}