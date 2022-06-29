package com.lara.pack24.mixedQuestion.test;
//Print 1 ONE 2 TWO with two thread

class A implements Runnable{
	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		int i =1;
		while(i<=10) {
			try {
				synchronized (this) {
					this.notify();
					if("ODD".equals(thName) && i%2==1)
						System.out.println(thName +" : "+i);
					else if("EVE".equals(thName) && i%2==0)
						System.out.println(thName +" : "+i);
					Thread.sleep(500);
					i++;
					this.wait();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class TestDelete {
	public static void main(String[] args) {
		A a = new A();
		Thread th1 = new Thread(a, "ODD");
		Thread th2 = new Thread(a, "EVE");
		th1.start();
		th2.start();
		System.out.println("Finished");
	}
}
