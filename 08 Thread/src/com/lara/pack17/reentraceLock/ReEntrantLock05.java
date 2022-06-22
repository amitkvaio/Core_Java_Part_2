package com.lara.pack17.reentraceLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThreadD extends Thread{
	static ReentrantLock lock = new ReentrantLock();
	
	public MyThreadD(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		do {
			String tname = Thread.currentThread().getName();
			try {
				if (lock.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(tname +" got locked");
					Thread.sleep(3000);
					lock.unlock();
					System.out.println(tname +" release the lock!!");
					break;
				} else {
					System.out.println(tname +" Unable to get the lock and will try again!! ");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (true);
	}
}

public class ReEntrantLock05 {
	public static void main(String[] args) {
		MyThreadD c1 = new MyThreadD("FirstThread");
		MyThreadD c2 = new MyThreadD("SecondThread");
		c1.start();
		c2.start();
	}
}
