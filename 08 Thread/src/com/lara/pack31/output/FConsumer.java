package com.lara.pack31.output;

public class FConsumer extends Thread {
	EProducer prod;

	FConsumer(EProducer obj) {
		prod = obj;
	}

	public void run() {
		synchronized (this.prod) {
			System.out.println("Consumer waiting for production to get over.");
			try {
				this.prod.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		int productSize = this.prod.sharedQueue.size();
		for (int i = 0; i < productSize; i++)
			System.out.println("Consumed : " + this.prod.sharedQueue.remove(0) + " ");
		}
	}
}
/*

Because of minor delay delay consThread surely started before producer thread. 
	"Consumer waiting for production to get over." printed first
than producer produced
than "Production is over, consumer can consume."
than consumer consumed.

Consumer waiting for production to get over.
Producer is still Producing, Produced : 1
Producer is still Producing, Produced : 2
Producer is still Producing, Produced : 3
Production is over, consumer can consume.
Consumed : 1
Consumed : 2
Consumed : 3

*/