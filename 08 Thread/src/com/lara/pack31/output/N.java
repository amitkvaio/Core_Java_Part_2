package com.lara.pack31.output;

public class N implements Runnable {
	public void run() {
		method();
	}

	synchronized void method() {
		for (int i = 0; i < 2; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String... args) {
		N runnable = new N();
		Thread thread1 = new Thread(runnable, "Thread-1");
		Thread thread2 = new Thread(runnable, "Thread-2");
		thread1.start();
		thread2.start();
	}
}

/*
 
Thread behavior is unpredictable because execution of Threads depends on Thread scheduler,
 either of thread1 and thread2 can start first and synchronized method will be executed by one thread at a time.

if Thread-1 entered first in synchronized block.
 
Thread-1
Thread-1
Thread-2
Thread-2
 
if Thread-2 entered first in synchronized block.
 
Thread-2
Thread-2
Thread-1
Thread-1
 
*/