package com.lara.pack15.cyclickbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ServiceTwo  implements Runnable {
	private final CyclicBarrier cyclicBarrier;
	 
    public ServiceTwo(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }
 
	@Override
	public void run() {
		System.out.println("Starting service Two....");
		try {
			Thread.sleep(5000);
			System.out.println("Service Two has finished its work.. waiting for others...");
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e1) {
			e1.printStackTrace();
		}
		System.out.println("The wait is over, lets complete Service two!");
	}
}
