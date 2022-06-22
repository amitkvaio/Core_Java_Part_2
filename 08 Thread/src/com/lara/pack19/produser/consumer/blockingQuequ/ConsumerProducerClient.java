package com.lara.pack19.produser.consumer.blockingQuequ;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConsumerProducerClient {
	public static void main(String[] args) {
		BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<Integer>(2);
		Producer producer = new  Producer(blockingQueue);
		Consumer consumer = new Consumer(blockingQueue);
		Thread thProducer = new Thread(producer,"Producer1");
		Thread thConsumer = new Thread(consumer);
		thProducer.start();
		thConsumer.start();
	}
}

/*
BlockingQueue:

The BlockingQueue interface is part of the java.util.concurrent package. 

If a producer thread tries to put an element in a full BlockingQueue, 
	it gets blocked and stays blocked until a consumer removes an element.
Similarly, if a consumer thread tries to take an element from an empty BlockingQueue, 
	it gets blocked and remains blocked until a producer adds an element.


*/
