package com.lara.pack17.reentraceLock;

public class ReentrantLockCustomClient {
	public static void main(String[] args) {

		LockCustom LockCustom = new ReentrantLockCustom();
		MyRunnable myRunnable = new MyRunnable(LockCustom);
		Thread t1=new Thread(myRunnable, "Thread-1");
		Thread t2=new Thread(myRunnable, "Thread-2");
		
		t1.start();
		t2.start();

	}
}
