//Program to demonstrate usage of readLock() method of ReadWriteLock in java
package com.lara.pack20.readwriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadRunnable implements Runnable {

	ReentrantReadWriteLock readWriteLock;

	public ReadRunnable(ReentrantReadWriteLock lock) {
		this.readWriteLock = lock;
	}

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		/*
		 * More than one threads can acquire readLock at a time provided no other thread
		 * is acquiring writeLock at same time.
		 */
		readWriteLock.readLock().lock();
		System.out.println(threadName + " has acquired read lock.");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println(threadName + " has released read lock.");
			readWriteLock.readLock().unlock();
		}
	}
}
