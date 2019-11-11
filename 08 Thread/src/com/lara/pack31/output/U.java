package com.lara.pack31.output;

public class U extends Thread {
	public static void main(String[] args) {
		Thread thread1 = new U();
		thread1.start();
		System.out.println("Done");
	}
}

/*

Nothing will be printed in output.

When we call start() method on thread, it internally calls run() method with newly created thread. 
So, if we don’t override run() method newly created thread won’t be called and nothing will happen.

It will called the Thread class run method which is empty implementation
*/