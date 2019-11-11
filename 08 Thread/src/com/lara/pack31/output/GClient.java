package com.lara.pack31.output;

public class GClient {
	public static void main(String args[]) throws InterruptedException {

		EProducer prod = new EProducer();
		FConsumer cons = new FConsumer(prod);

		Thread prodThread = new Thread(prod, "prodThread");
		Thread consThread = new Thread(cons, "consThread");

		consThread.start();
		Thread.sleep(100); // minor delay.
		prodThread.start();

	}
}
