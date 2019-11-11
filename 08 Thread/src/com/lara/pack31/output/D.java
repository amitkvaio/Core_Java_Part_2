package com.lara.pack31.output;

public class D implements Runnable {

	public void run() {

		synchronized (this) {
			System.out.println("1 ");
			try {
				this.wait();
				System.out.println("2 ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {

		D myRunnable = new D();
		Thread thread1 = new Thread(myRunnable, "Thread-1");
		thread1.start();

	}
}
/*

thread acquires lock on myRunnable object so 1 was printed but 
notify wasn't called so 2 will never be printed, this is called frozen process. 
Deadlock is formed, These type of  deadlocks are called Frozen processes.
	
1
 
*/