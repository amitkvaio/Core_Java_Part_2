package com.lara.pack31.output;

public class I implements Runnable {
	public void run() {

		System.out.println(Thread.currentThread().getName() + " has started");
		try {
			Thread.sleep(100); // ensure that main thread don’t complete before Thread-1
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " has ended");

	}

	public static void main(String... args) throws InterruptedException {

		System.out.println(Thread.currentThread().getName() + " has started");

		Thread thread1 = new Thread(new I(), "Thread-1");
		thread1.start();
		thread1.sleep(10000);
		//Thread.sleep(10000);
		System.out.println(Thread.currentThread().getName() + " has ended");

	}
}

/*
 
sleep() is a static method, causes the currently executing thread to sleep for the specified number of milliseconds. 

Calling thread1.sleep(10000);  will show warning - The static method sleep(long) from the type Thread should 
be accessed in a static way.


In the program first main thread started, than it invoked Thread-1, then Thread-1 called sleep(100) method to 
ensure that main thread don’t complete before Thread-1, than execution control went to  main thread  
and it called thread1.sleep(10000) but rather than putting Thread-1 on sleep it made main thread to sleep. 
And Thread-1 ended before main thread 
 
main has started
Thread-1 has started
Thread-1 has ended
main has ended
 
 
*/
















