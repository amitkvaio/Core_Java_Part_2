package com.lara.pack31.output;

public class H implements Runnable {

	public void run() {
		synchronized (this) {
			System.out.print("1 ");
			try {
				this.wait(1000);
				System.out.print("2");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		H myRunnable = new H();
		Thread thread1 = new Thread(myRunnable, "Thread-1");
		thread1.start();
	}
}
/*
 
First 1 will be printed then even if notify() or notifyAll() is not called, 
thread will be notified after 1000 millisec and 2 will be printed.

1 2

*/


