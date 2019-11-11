//Yield method example.
package com.basic;

public class E {
	public static void main(String[] args) {
		Thread producer = new Producer();
		producer.start();
		producer.setPriority(Thread.MIN_PRIORITY); // Min Priority
		 
		
		Thread mt = Thread.currentThread();
		//Control passes to child thread 
		Thread.yield();
		for (int i = 0; i < 5 ; i++) {
			System.out.println(mt.getName() +" Running ---");
		}
	}
}

class Producer extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Producer : Produced Item " + i);
		}
	}
}



