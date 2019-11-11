package com.lara.pack17.reentraceLock;

import java.util.concurrent.locks.ReentrantLock;

class MyThreadC extends Thread{
	static ReentrantLock lock = new ReentrantLock();
	
	public MyThreadC(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		String tname=Thread.currentThread().getName();
		if(lock.tryLock()) {
		 try {
			 for (int i = 0; i < 4; i++) {
				 Thread.sleep(1000);
				 System.out.println( tname+ " get the lock and Performing safe operation");
			 }
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 lock.unlock();
		}else {
			 System.out.println(tname + " Unbale to get the lock hence performing Alternate operation");
		}
	}
}

public class ReEntrantLock04 {
	public static void main(String[] args) {
		MyThreadC c1 = new MyThreadC("FirstThread");
		MyThreadC c2 = new MyThreadC("SecondThread");
		c1.start();
		c2.start();
	}
}
