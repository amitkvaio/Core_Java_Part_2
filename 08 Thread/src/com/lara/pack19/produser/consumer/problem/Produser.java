package com.lara.pack19.produser.consumer.problem;

import java.util.Random;

public class Produser implements Runnable {
	private Buffer buffer=null;
	public Produser(Buffer buffer) {
		this.buffer=buffer;
	}
	
	@Override
	public void run() {
		while(true) {
			Random random = new Random();
			int data = random.nextInt();
			this.buffer.produser(data);
		}
	}
}
