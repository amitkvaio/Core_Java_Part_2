package com.lara.pack31.output;

public class V extends Thread {

	public void run() {
		System.out.println("1");
	}

	public void start() {
		System.out.println("2");
	}

	public static void main(String[] args) {
		V thread1 = new V();
		thread1.start();

	}
}

/*

When we call start() method on thread, it internally calls run() method with newly created thread. 
So, if we override start() method, run() method will not be called until we write code for calling run() method.

2
 
*/

