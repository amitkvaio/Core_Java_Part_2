package com.lara.pack22.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
	// max 2 people
	static Semaphore semaphore = new Semaphore(2);

	public static void main(String[] args) {
		System.out.println("Total available Semaphore permits : " + semaphore.availablePermits());
		MyThread t1 = new MyThread(semaphore);
		MyThread t2 = new MyThread(semaphore);
		MyThread t3 = new MyThread(semaphore);
		MyThread t4 = new MyThread(semaphore);
		t2.start();
		t1.start();
		t3.start();
		t4.start();
		 

	}
}
