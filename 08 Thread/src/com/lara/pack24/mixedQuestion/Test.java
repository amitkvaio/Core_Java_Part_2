package com.lara.pack24.mixedQuestion;
class PrintEvenOdd1 implements Runnable {

	int remender;
	public static final int MAX = 20;
	static int num=1;
	static Object lock = new Object();
	public PrintEvenOdd1(int num) {
		this.remender=num;
	}
	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		while(num < MAX) {
			synchronized (lock) {
				while(num % 3 != remender) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(thName +"->"+num);
				num++;
				lock.notifyAll();
			}
		}
	}	
	
}

public class Test {
	public static void main(String[] args) {
		PrintEvenOdd1 p1 = new PrintEvenOdd1(0);
		PrintEvenOdd1 p2 = new PrintEvenOdd1(1);
		PrintEvenOdd1 p3 = new PrintEvenOdd1(2);
		
		Thread th1 = new Thread(p1, "ONE");
		Thread th2 = new Thread(p2, "TWO");
		Thread th3 = new Thread(p3, "THR");
		 
		th1.start();
		th2.start();
		th3.start();
		 
		System.out.println("Main thread has finished!!");
	}
}
