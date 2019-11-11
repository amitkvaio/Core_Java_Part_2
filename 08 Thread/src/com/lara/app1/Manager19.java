package com.lara.app1;

public class Manager19 {
	static class B implements Runnable {
		public void run() {
			for (int i = 0; i < 100; i++) {
				System.out.println("run=" + i);
			}
		}
	}
	public static void main(String[] args) {
		B b1 = new B();
		Thread t1 = new Thread(b1);
		t1.start();
		for (int i = 200; i < 300; i++) {
			System.out.println("main=" + i);
		}
	}
}
