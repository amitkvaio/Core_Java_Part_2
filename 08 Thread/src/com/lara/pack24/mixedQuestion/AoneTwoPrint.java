package com.lara.pack24.mixedQuestion;


class B{
	public void method1() {
		String thName = Thread.currentThread().getName();
		while (true) {
			synchronized (this) {
				try {
					this.notify();
					if ("ONE".equals(thName)) {
						System.out.println(thName + " " + 1);
					} else {
						System.out.println(thName + " " + 2);
					}
					Thread.sleep(1000);
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public void method2() {
		String thName = Thread.currentThread().getName();
		int i =1;
		while (true) {
			synchronized (this) {
				try {
					this.notify();
					//System.out.println("i::" + i + " >>>" + i % 3 + " " + thName);
					
					if ("ONE".equals(thName) && i%3==1 ) {
						System.out.println(thName + " " + i);
					} else if ("TWO".equals(thName) && i%3==2 ) {
						System.out.println(thName + " " + i);
					}else if ("THREE".equals(thName) && i%3==0 ) {
						System.out.println(thName + " " + i);
					}
					
					Thread.sleep(1000);
					i++;
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}

class A implements Runnable{
	B b;
	public A(B b) {
		this.b=b;
	}
	@Override
	public void run() {
		//b.method1();
		b.method2();
	}
}

public class AoneTwoPrint {
	public static void main(String[] args) {
		B b = new B();
		A a1 = new A(b);
		A a2 = new A(b);
		Thread th1 = new Thread(a1, "ONE");
		Thread th2 = new Thread(a2, "TWO");
		Thread th3 = new Thread(a2, "THREE");
		th1.start();
		th2.start();
		th3.start();
		System.out.println("Finished");
	}
}
