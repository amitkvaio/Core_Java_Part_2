package com.lara.pack18.callableInterface;

import java.util.concurrent.Callable;

public class AreaOfACircle implements Callable<Double> {
	double rad = 0.0;

	public AreaOfACircle(double d) {
		rad = d;
	}

	@Override
	public Double call() throws Exception {
		String thName = Thread.currentThread().getName();
		System.out.println("**********From AreaOfACircle@call**********"+thName);
		Client.sleep(5000);
		return Math.PI * rad * rad;
	}
}