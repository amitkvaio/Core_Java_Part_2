package com.lara.pack19.produser.consumer.blockingQuequ;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
class Demo1 extends Thread {
	Shared lock;

	public Demo1(Shared lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.method1();
	}
}
class Demo2 extends Thread {
	Shared lock;

	public Demo2(Shared lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.method2();
	}
}

class Shared {
	public void method1() {
		String thName = Thread.currentThread().getName();
		synchronized (String.class) {
			synchronized (Integer.class) {
				System.out.println(thName + " Inside method1()");
			}
		}
	}
	
	public void method2() {
		String thName = Thread.currentThread().getName();
		synchronized (Integer.class) {
			synchronized (String.class) {
				System.out.println(thName + " Inside method2()");
			}
		}
	}
}
 

public class Test {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Demo1 t1 = new Demo1(shared);
		Demo2 t2 = new Demo2(shared);
		t1.start();
		t2.start();
		System.out.println("-------done-------");
	}
}
