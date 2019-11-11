package com.lara.app1;

class J extends Thread {
	public void run() {
		System.out.println("j-begin");
		int i = 10 / 0;
		System.out.println("j-end");
	}
}

class K extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("from K thread class-" + i);
		}
	}
}

public class Manager14 {
	public static void main(String[] args) {
		J j1 = new J();
		j1.start();

		K k1 = new K();
		k1.start();

		for (int i = 200; i < 400; i++) {
			System.out.println("from Manager14 class-" + i);
		}
	}
}
