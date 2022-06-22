package com.lara.pack18.callableInterface;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientThread implements Runnable {
	double rad = 0.0;

	public ClientThread(double d) {
		rad = d;
	}
	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		try {
			double areaoFCircle=Math.PI * rad * rad;
			Thread.sleep(2000);
			System.out.println("AreaOf Circle is :"+areaoFCircle + "Radius : "+rad + " Thread Name : "+thName);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		double rad=2.5;
		try {
			for (int i = 0; i <= 20 ; i++) {
				service.execute(new ClientThread(rad));
				Thread.sleep(1500);
				rad++;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			service.shutdown();
		}
	}
}
