package com.lara.app1;

public class Manager22 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("run->" + i);
				}
			}
		};
		t1.start();
		for (int i = 100; i < 200; i++) {
			System.out.println("main->" + i);
		}
	}
}
