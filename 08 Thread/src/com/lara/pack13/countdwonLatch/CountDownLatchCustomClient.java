package com.lara.pack13.countdwonLatch;

public class CountDownLatchCustomClient implements Runnable {
	CountDownLatchCustom custom;
	
	public CountDownLatchCustomClient(CountDownLatchCustom custom) {
		this.custom=custom;
	}
	
	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		System.out.println(thName + " Count :"+custom.getCount() + " Before");
		custom.countDown();
		System.out.println(thName + " Count :"+custom.getCount() + " After");
	}
	
	public static void main(String[] args) throws InterruptedException {
		CountDownLatchCustom custom = new CountDownLatchCustom(2);
		CountDownLatchCustomClient c1 = new CountDownLatchCustomClient(custom);
		CountDownLatchCustomClient c2 = new CountDownLatchCustomClient(custom);
		Thread t1 = new Thread(c1, "Thread-1");
		Thread t2 = new Thread(c1, "Thread-2");
		t1.start();
		t2.start();
		custom.await();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread started : "+i);
		}
	}
}
