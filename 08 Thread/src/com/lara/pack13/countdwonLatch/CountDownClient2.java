package com.lara.pack13.countdwonLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownClient2 {
	public static void main(String[] args) {
		CountDownLatch countDownLatch = new CountDownLatch(3);
		System.out.println("CountDownLatch has been created with count=3");
		CountDownRunnable count = new CountDownRunnable(countDownLatch);
		Thread th1 = new Thread(count, "Thread-1");
		Thread th2 = new Thread(count, "Thread-2");
		Thread th3 = new Thread(count, "Thread-3");
		th1.start();
		th2.start();
		th3.start();
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String thName = Thread.currentThread().getName();
		System.out.println("count has reached zero, " + thName + " thread has ended");

	}
}
