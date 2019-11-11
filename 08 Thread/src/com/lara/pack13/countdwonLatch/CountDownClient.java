package com.lara.pack13.countdwonLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownClient {
	public static void main(String[] args) {
		try {
			CountDownLatch countDownLatch = new CountDownLatch(3);
			System.out.println("CountDownLatch has been created with count=3");
			CountDownRunnable count = new CountDownRunnable(countDownLatch);
			Thread th1 = new Thread(count, "Thread-1");
			Thread th2 = new Thread(count, "Thread-2");
			Thread th3 = new Thread(count, "Thread-3");
			th1.start();
			Thread.sleep(5000);
			th2.start();
			Thread.sleep(10000);
			th3.start();
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String thName = Thread.currentThread().getName();
		System.out.println("count has reached zero, " + thName + " thread has ended");

	}
}
/*
1.CountDownLatch has been created with count=3
Initially, CountDownLatch is created with count=3
main thread called countDownLatch.await() and it is waiting for count to become 0.
Thread-1 called countDownLatch.countDown()  method. [Now, count=2]
2.Thread-1 has reduced latch count to : 2

Thread-1 called countDownLatch.countDown()  method. [Now, count=1]
3.Thread-1 has reduced latch count to : 1

Thread-1 called countDownLatch.countDown()  method. [Now, count=0]
4.Thread-1 has reduced latch count to : 0

count has reached zero, main thread has ended
As, count has reached zero, main thread has ended.
 
*/