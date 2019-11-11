package com.lara.pack03.deadlock;
 
public class Manager03 {
	public static void main(String[] args) {
		DeadLockAvoidExp lock = new DeadLockAvoidExp();
		Demo3 d1 = new Demo3(lock);
		Demo4 d2 = new Demo4(lock);
		d1.start();
		d2.start();
		System.out.println("Main method finished");
		Manager02.getInfoForDeadLock();
	}
}

class Demo3 extends Thread {
	DeadLockAvoidExp lock;

	public Demo3(DeadLockAvoidExp lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.method1();
	}
}

class Demo4 extends Thread {
	DeadLockAvoidExp lock;

	public Demo4(DeadLockAvoidExp lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.method2();
	}
}

