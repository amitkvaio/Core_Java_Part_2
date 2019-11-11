package com.lara.pack31.output;

public class W implements Runnable {

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("Thread-1"))
			method1();
		else
			method2();
	}
	// its required the class lock -  for one class there is only one class lock - even we create multiple object for it
	static synchronized void method1() {
		System.out.println(Thread.currentThread().getName() + " in synchronized void method1() started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " in synchronized void method1() ended");
	}

	static synchronized void method2() {
		System.out.println(Thread.currentThread().getName() + " in synchronized void method2() started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " in synchronized void method2() ended");
	}

	public static void main(String args[]) throws InterruptedException {

		W object1 = new W();
		W object2 = new W();

		Thread thread1 = new Thread(object1, "Thread-1");
		Thread thread2 = new Thread(object2, "Thread-2");
		thread1.start();
		Thread.sleep(10);// Just to ensure Thread-1 starts before Thread-2
		thread2.start();

	}
}
/*

It might confuse you a bit that threads are created on different objects. 
	But, not to forgot that multiple objects may exist but there is always one class’s class object lock available.

Here, when Thread-1 is in static synchronized method1() 
	it must be holding lock on class class’s object and will release lock on class’s class object only 
	when it exits static synchronized method1(). So, Thread-2 will have to wait for 
	Thread-1 to release lock on class’s class object so that it could enter static synchronized method2().

Thread-1 in synchronized void method1() started
Thread-1 in synchronized void method1() ended
Thread-2 in synchronized void method2() started
Thread-2 in synchronized void method2() ended
 
*/


