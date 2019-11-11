package com.lara.pack19.produser.consumer.problem;

public class Buffer {
	private int data;
	private boolean isEmpty;
	
	public Buffer() {
		this.isEmpty=true;
	}

	public synchronized int consumer() {
		while (this.isEmpty) {
			try {
				wait();
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumed Data : " + this.data);
		this.isEmpty = true;
		this.notify();
		return this.data;

	}

	public synchronized void produser(int newData) {
		while (!this.isEmpty) {
			try {
				wait();
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.data = newData;
		this.isEmpty = false;
		this.notify();
		System.out.println("Prodused Data : " + newData);
	}
}
