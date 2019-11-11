package com.lara.pack03.deadlock;

public class Demo2 extends Thread {
	DeadLockEx lock;

	public Demo2(DeadLockEx lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.method2();
	}
}
