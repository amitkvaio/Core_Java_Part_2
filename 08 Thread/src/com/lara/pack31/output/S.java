package com.lara.pack31.output;

public class S implements Runnable {

	public void run() {

		System.out.println("1 ");
		try {
			this.wait();
			// wait method should be called form the synchronized method or synchronized block
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("2 ");

	}

	public static void main(String[] args) {
		S myRunnable = new S();
		Thread thread1 = new Thread(myRunnable, "Thread-1");
		thread1.start();

	}
}

/*
IllegalMonitorStateException is thrown at runtime, as wait() method was called without acquiring lock on object monitor.

1
Exception in thread "Thread-1" java.lang.IllegalMonitorStateException
	at java.lang.Object.wait(Native Method)
	at java.lang.Object.wait(Object.java:502)
	at com.lara.pack31.output.S.run(S.java:9)
	at java.lang.Thread.run(Thread.java:748)

*/