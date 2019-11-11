package com.lara.app1;

public class Manager20 {
	public static void main(String[] args) {
		class A extends Thread {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("run=" + i);
				}
			}
		}
		A a1 = new A();
		a1.start();
		for (int i = 1100; i < 2000; i++) {
			System.out.println("main=" + i);
		}
	}
}
