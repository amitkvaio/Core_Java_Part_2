package com.lara.app1;

class H extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}

public class Manager12 {

	public static void main(String[] args) {
		H h1 = new H();
		h1.start();
		System.out.println("------");
		h1.start();
		System.out.println("done");
	}
}
// we can not call the same thread twice it will throws an exception saying -IllegalThreadStateException