package com.lara.pack17.reentraceLock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock01 {
	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		lock.lock();
		lock.lock();
		System.out.println(lock.isLocked());//T
		System.out.println(lock.isHeldByCurrentThread());//T
		System.out.println(lock.getQueueLength());//0
		lock.unlock();
		System.out.println(lock.getHoldCount());//1
		System.out.println(lock.isLocked());//T
		lock.unlock();
		System.out.println(lock.isLocked());//F
		System.out.println(lock.isFair());//F
	}
}
