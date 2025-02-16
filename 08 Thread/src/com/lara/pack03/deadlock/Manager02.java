//Program demonstrate about deadLock
package com.lara.pack03.deadlock;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;


class Demo1 extends Thread {
	DeadLockEx lock;

	public Demo1(DeadLockEx lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.method1();
	}
}

class Demo2 extends Thread {
	DeadLockEx lock;

	public Demo2(DeadLockEx lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.method2();
	}
}

public class Manager02 {
	public static void main(String[] args) {
		DeadLockEx lock = new DeadLockEx();
		Demo1 d1 = new Demo1(lock);
		Demo2 d2 = new Demo2(lock);
		d1.start();
		d2.start();
		System.out.println("Main method finished");
		System.out.println(d1.getState());
		System.out.println(d2.getState());
		Manager02.getInfoForDeadLock();
	}

	public static void getInfoForDeadLock() {
		ThreadMXBean tx = ManagementFactory.getThreadMXBean();

		long ids[] = tx.findDeadlockedThreads();

		if (ids != null) {
			System.out.println("dead locked threads are:");

			ThreadInfo[] ti = tx.getThreadInfo(ids);

			ThreadInfo thInfo = null;

			for (int i = 0; i < ti.length; i++) {
				thInfo = ti[i];

				System.out.println(thInfo.getThreadName());
			}
		} else {
			System.out.println("no threads are under locked");
		}
	}
}
