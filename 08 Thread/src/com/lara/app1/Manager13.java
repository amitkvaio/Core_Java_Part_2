package com.lara.app1;

class I extends Thread {
	public void run() {
		int i = 10 / 0;
		System.out.println("end of child");
	}
}

public class Manager13 {
	public static void main(String[] args) {
		I i1 = new I();
		i1.start();
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}
// the child thread will terminate the execution because it will throws an AME - it now being handle
// but main thread will continue its execution