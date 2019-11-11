//Program to demonstrate usage of writeLock() method of ReadWriteLock in java
package com.lara.pack20.readwriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class WriteRunnable implements Runnable {
	ReentrantReadWriteLock readWriteLock ;
	
	public WriteRunnable(ReentrantReadWriteLock lock) {
		this.readWriteLock=lock;
	}
	
	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		try {
			readWriteLock.writeLock().lock();
			System.out.println(thName +" has acquired the lock!");
			for (int i = 1; i <= 2; i++) {
				System.out.println(i*i);
			}
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println(thName +" has released the lock!");
			readWriteLock.writeLock().unlock();
		}
	}
}
