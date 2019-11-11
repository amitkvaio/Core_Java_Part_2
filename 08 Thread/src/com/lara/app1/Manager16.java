package com.lara.app1;

class M extends Thread {
	M() {
		this.start();
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("run=" + i);
		}
	}

}

public class Manager16 {
	public static void main(String[] args) {
		M m1 = new M();
		for (int i = 100; i < 200; i++) {
			System.out.println("main=" + i);

		}
	}

}
