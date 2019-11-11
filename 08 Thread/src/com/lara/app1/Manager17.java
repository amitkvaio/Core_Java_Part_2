package com.lara.app1;

class N extends Thread {
	N() {
		start();
	}
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("from N thread class-" + i);
		}
	}
}

public class Manager17 {
	public static void main(String[] args) {
		N n1 = new N();
		n1.start();
		for (int i = 100; i < 200; i++) {
			System.out.println("from Manager17 class-" + i);
		}
	}
}
