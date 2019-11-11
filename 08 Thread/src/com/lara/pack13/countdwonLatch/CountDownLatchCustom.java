package com.lara.pack13.countdwonLatch;

public class CountDownLatchCustom {
	int count;
	public CountDownLatchCustom(int count) {
		this.count=count;
	}
	
	public synchronized void countDown() {
		count--;
		if(count == 0) {
			notify();
		}
	}
	
	public synchronized void await() throws InterruptedException {
		if(count > 0) {
			wait();
		}
	}
	public int getCount() {
		return count;
	}
}
