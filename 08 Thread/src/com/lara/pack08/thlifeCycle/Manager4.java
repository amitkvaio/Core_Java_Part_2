//71
package com.lara.pack08.thlifeCycle;

class C extends Thread {
	public synchronized void run() {
		System.out.println("Bgin");
		try {
			wait();
			for(int i =1 ; i < 50; i ++) {
				System.out.println("Child Thread ::" + this.getName() + " : " + i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}

public class Manager4 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("c1 thread before notify call state->" + c1.getState());

		synchronized (c1) {
			System.out.println("c1 1 thread after notify call state->" + c1.getState());
			c1.notify();
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("c1 >>>>>2 thread after notify call state->" + c1.getState());
		}
		System.out.println("c1 3 thread after notify call state->" + c1.getState());
		System.out.println("c1 4 thread after notify call state->" + c1.getState());
	}
}
