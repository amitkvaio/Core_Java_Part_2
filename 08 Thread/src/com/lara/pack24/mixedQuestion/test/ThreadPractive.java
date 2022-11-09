package com.lara.pack24.mixedQuestion.test;
/*
Print 
Main thread finished
ONE-1
TWO-2
ONE-1
TWO-2
ONE-1
TWO-2
*/
class B {
	public void print() {
		String thName  =  Thread.currentThread().getName();
		while(true) {
			try {
				synchronized (this) {
					this.notify();
					if("ONE".equals(thName))
						System.out.println(thName +"-"+ 1);
					else if("TWO".equals(thName))
						System.out.println(thName +"-"+2);
					Thread.sleep(1000);
					this.wait();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class C implements Runnable{
	B b;
	public C(B b) {
		this.b=b;
	}
	@Override
	public void run() {
		b.print();
	}
}
public class ThreadPractive {
	public static void main(String[] args) {
		B b = new B();
		C c = new C(b);
		Thread th1 = new Thread(c,"ONE");
		Thread th2 = new Thread(c,"TWO");
		th1.start();
		th2.start();
		System.out.println("Main thread finished");
		
	}
}
