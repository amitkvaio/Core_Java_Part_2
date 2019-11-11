package com.lara.pack13.countdwonLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownRunnable implements Runnable {

	CountDownLatch countDownLatch;

	public CountDownRunnable(CountDownLatch latch) {
		this.countDownLatch = latch;
	}

	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		try {
			System.out.println(thName + " Count:" + countDownLatch.getCount() + " Before");
			Thread.sleep(2000);
			countDownLatch.countDown();
			System.out.println(thName + " Count:" + countDownLatch.getCount() + " After");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
