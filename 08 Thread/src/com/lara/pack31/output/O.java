package com.lara.pack31.output;

public class O {
	public static void main(String[] args) {
		Thread thread1 = new Thread("Thread-1") {
			public void run() {

				synchronized (String.class) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("1 ");
					synchronized (Object.class) {
						System.out.println("2 ");
					}
				}
				System.out.println("3 ");
			}
		};

		Thread thread2 = new Thread("Thread-2") {
			public void run() {
				synchronized (Object.class) {
					System.out.println("4 ");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (String.class) {
						System.out.println("5 ");
					}
				}
				System.out.println("6 ");
			}
		};
		thread1.start();
		thread2.start();
	}
}

/*
Deadlock is formed in above program :
Thread-1 acquires lock on String.class and then calls sleep() method which gives Thread-2 the chance to execute 
immediately after Thread-1 has acquired lock on String.class and Thread-2 acquires lock on Object.class then 
calls sleep() method and now it waits for Thread-1 to release lock on String.class.

Conclusion:
Now, Thread-1 is waiting for Thread-2 to release lock on Object.class and Thread-2 is waiting for Thread-1 to 
release lock on String.class and deadlock is formed.
   
4
1

*/   

