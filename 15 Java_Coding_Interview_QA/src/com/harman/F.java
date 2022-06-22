package com.harman;

public class F extends Thread {
	@Override
	public void run() {
		System.out.println("Hello...");
	}
	public static void main(String[] args) {
		F f = new F();
		f.start();
		f.stop();
		f.start();
		System.out.println("Finished");
	}
}
