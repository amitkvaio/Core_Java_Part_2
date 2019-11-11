package com.lara.pack24.jointwouserThread;

public class ChildThread implements Runnable {
	 
	public void run() {
		String thName = Thread.currentThread().getName();
		System.out.println(thName + " has Started their work!!");
		for (int i = 1; i <=5; i++) {
			System.out.println(thName + " -> "+i);
		}
		System.out.println( thName +" has finished their work!!");
	}
}
