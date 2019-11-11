package com.lara.pack24.jointwouserThread;

public class ParentThread implements Runnable {
	public Thread childTh1;
	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		System.out.println(thName + " Started");
		try {
			System.out.println(thName +" is waiting to finish child thread activity!!");
			childTh1.join();
			for (int i = 1; i <= 5; i++) {
				System.out.println(thName + " After Join -> " + i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(thName + " has finished their work!!");
	}
	
	public void setChildThread(Thread th) {
		this.childTh1=th;
	}
}
