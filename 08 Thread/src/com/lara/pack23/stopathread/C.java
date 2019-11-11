package com.lara.pack23.stopathread;

class MyRunnable implements Runnable {

	public void run() {
		int i = 0;

		try {
			boolean status = Thread.currentThread().isInterrupted();
			System.out.println("Status :"+status);
			while (!status) {
				Thread.sleep(1000);
				System.out.println(i++ + " Please press enter key to stop " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " ENDED-->>>>>>");
		}
	}
}
  
public class C {
	public static void main(String args[]) throws Exception {

		MyRunnable obj = new MyRunnable();
		Thread t = new Thread(obj, "Thread-1");
		t.start();

		System.out.println(Thread.currentThread().getName() + " thread waiting for user to press enter");
		System.in.read();
		t.interrupt();
		System.out.println(Thread.currentThread().getName() + " thread ENDED");

	}
}
