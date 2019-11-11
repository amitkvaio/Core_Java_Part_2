package com.lara.pack31.output;

public class R implements Runnable {

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("Thread-1"))
			method1();
		else
			method2();
	}

	synchronized void method1() {
		System.out.println(Thread.currentThread().getName() + " in synchronized void method1() started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " in synchronized void method1() ended");
	}

	synchronized void method2() {
		System.out.println(Thread.currentThread().getName() + " in synchronized void method2() started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " in synchronized void method2() ended");
	}

	public static void main(String args[]) throws InterruptedException {

		R myRunnable1 = new R();

		Thread thread1 = new Thread(myRunnable1, "Thread-1");
		Thread thread2 = new Thread(myRunnable1, "Thread-2");
		thread1.start();
		Thread.sleep(10);// Just to ensure Thread-1 starts before Thread-2
		thread2.start();

	}
}

/*

Here when Thread-1 is in synchronized method1() it must be holding lock on object’s monitor and will 
	release lock on object’s monitor only when it exits synchronized method1(). 
	So, Thread-2 will have to wait for Thread-1 to release lock on object’s monitor so that it could enter synchronized method2().


Likewise, Thread-2 even cannot enter synchronized method1() which is being executed by Thread-1. 
	Thread-2 will have to wait for Thread-1 to release lock on object’s monitor so that it could enter synchronized method1().
 
Thread-1 in synchronized void method1() started
Thread-1 in synchronized void method1() ended
Thread-2 in synchronized void method2() started
Thread-2 in synchronized void method2() ended
 
*/

