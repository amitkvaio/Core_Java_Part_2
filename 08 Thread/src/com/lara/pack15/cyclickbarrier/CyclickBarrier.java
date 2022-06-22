package com.lara.pack15.cyclickbarrier;

import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclickBarrier {
	public static void main(String[] args) {
		// 3 threads are part of the barrier, ServiceOne, ServiceTwo and this main
		// thread calling them.
		final CyclicBarrier barrier = new CyclicBarrier(2);

		ServiceOne one = new ServiceOne(barrier);
		ServiceTwo two = new ServiceTwo(barrier);
		
		Thread serviceOneThread = new Thread(one);
		Thread serviceTwoThread = new Thread(two);

		System.out.println("Starting both the services at" + new Date());

		serviceOneThread.start();
		serviceTwoThread.start();

		try {
			barrier.await();
		} catch (InterruptedException e) {
			System.out.println("Main Thread interrupted!");
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			System.out.println("Main Thread interrupted!");
			e.printStackTrace();
		}
		barrier.reset();
		System.out.println("After reset : "+barrier.getParties());
		for (int i = 0; i < 10; i++) {
			System.out.println(" Main thread : ***********");
		}
		
		System.out.println("Ending both the services at" + new Date());
	}

}
