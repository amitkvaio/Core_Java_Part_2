package com.lara.pack19.produser.consumer.problem;

public class Consumer implements Runnable {

	private Buffer buffer=null;
	public Consumer(Buffer buffer) {
		this.buffer=buffer;
	}
	
	@Override
	public void run() {
		int data;
		while(true) {
			data = this.buffer.consumer();
		}
	}
}
