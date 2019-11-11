package com.lara.pack03.deadlock;

public class Demo1 extends Thread {
	DeadLockEx lock;

	public Demo1(DeadLockEx lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.method1();
	}
}
