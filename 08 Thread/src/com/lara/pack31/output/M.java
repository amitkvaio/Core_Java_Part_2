package com.lara.pack31.output;

public class M extends Thread {
	M() {
		System.out.print("1 ");
	}

	public void run() {
		System.out.print("2 ");
	}

	public static void main(String[] args) {
		Thread thread1 = new M() {
			public void run() {
				System.out.print("3 ");
			}
		};
		thread1.start();
	}
}
/*
new MyThread() > created instance of an anonymous inner class.
constructor was called which printed 1
than overridden run() method of anonymous inner class was invoked, which printed 3.

1 3

*/