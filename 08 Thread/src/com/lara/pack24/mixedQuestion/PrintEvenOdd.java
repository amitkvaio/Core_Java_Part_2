package com.lara.pack24.mixedQuestion;

class C {

	public int MAX = 20;
	static int num = 1;
	 
	public void method1(int remainder) {
		while (num < MAX) {
			String thName = Thread.currentThread().getName();
			synchronized (this) {
				//System.out.println("num%2:" + num % 2 + "-->" + (num % 2 != remainder) + " :" + thName + " " + num);
				if (num % 2 != remainder) { // wait for numbers other than remainder
					try {
						//System.out.println(thName + " start-->  " + num);
						Thread.sleep(1000);
						this.wait();
						//System.out.println(thName + " end-->  " + num);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(thName + "--->  " + num);
				num++;
				this.notify();
			}
		}
	}
}
public class PrintEvenOdd implements Runnable {
	public C c;
	int remainder;
	PrintEvenOdd(C c,int remainder) {
		this.c = c;
		this.remainder=remainder;
	}

	@Override
	public void run() {
		c.method1(remainder);
	}
}
//https://www.code2master.com/java/print-sequence-three-threads-java/