package com.lara.pack19.produser.consumer.problem;

public class ProduserConsumerClient {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Produser produser = new Produser(buffer);
		Consumer consumer = new Consumer(buffer);
		
		Thread produserThread = new Thread(produser);
		Thread consumerThread = new Thread(consumer);
		
		produserThread.start();
		consumerThread.start();
		
	}
}
/*
The producer/consumer is a typical thread synchronization problem that uses the wait() 
	and notify() methods. 
 
There are four classes: Buffer, Producer, Consumer, and ProduserConsumerClient.

An object of the Buffer class has an integer data element that will be produced 
	by the producer and consumed by the consumer.

We have to synchronize the access to the buffer, so the Producer produces a new 
	data element only when the Buffer is empty and the Consumer consumes the buffer's 
	data only when it is available.

The ProducerConsumerTest class is used to test the program. 


in producer-consumer problem, producer won’t try to add data into buffer once it full 
and the consumer won’t consume after buffer empty. 

The consumer will know when data entered into the buffer for consuming and 
producer must stop producing when consumption rate is slow and the buffer is filled.

*/