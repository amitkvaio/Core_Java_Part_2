package com.lara.pack031;

class Shared {
	void test1() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Shared-first for loop test1->" + i + "  "+ Thread.currentThread().getName());
			// simultaneous
		}

		synchronized (this) {
			for (int i = 50; i < 100; i++) {
				System.out.println("Shared-2nd for loop synchronized->" + i + "  "+ Thread.currentThread().getName());
				// sequential
			}

		}
		for (int i = 100; i < 150; i++) {
			System.out.println("Shared- third for loop test1->" + i + "  "+ Thread.currentThread().getName());
			// simultaneous
		}
	}
}

class A extends Thread {
	Shared s1;

	public A(Shared s1) {
		this.s1 = s1;
	}

	@Override
	public void run() {
		s1.test1();
	}
}

class B extends Thread {
	Shared s1;

	public B(Shared s1) {
		this.s1 = s1;
	}

	@Override
	public void run() {
		s1.test1();
	}
}

public class Manager1 {
	public static void main(String[] args) {
		System.out.println("main method start*******");
		Shared s1 = new Shared();
		A a1 = new A(s1);
		B b1 = new B(s1);
		a1.start();
		System.out.println("Main thread is sleeing for 5 second");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("***********************************************");
		b1.start();
		System.out.println("main method end*********");
	}
}

// output will be sequential