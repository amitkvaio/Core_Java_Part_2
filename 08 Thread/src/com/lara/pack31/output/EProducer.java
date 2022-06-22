package com.lara.pack31.output;

import java.util.ArrayList;

public class EProducer implements Runnable {

	ArrayList<Integer> sharedQueue;

	EProducer(){
           sharedQueue=new ArrayList<Integer>();
    }

	@Override
	public void run() {

		synchronized (this) {
			for (int i = 1; i <= 10; i++) { // Producer will produce 10 products
				sharedQueue.add(i);
				System.out.println("Producer is still Producing, Produced : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			System.out.println("Production is over, consumer can consume.");
			this.notify();
		}
	}
}

