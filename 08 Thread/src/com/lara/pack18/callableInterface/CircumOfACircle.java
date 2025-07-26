package com.lara.pack18.callableInterface;

import java.util.concurrent.Callable;

public class CircumOfACircle implements Callable<Double> {
	double rad = 0.0;

	public CircumOfACircle(double d) {
		rad = d;
	}

	@Override
	public Double call() throws Exception {
		String thName = Thread.currentThread().getName();
		System.out.println("**********From CircumOfACircle@call**********" + thName);
		Client.sleep(5000);
		return 2 * Math.PI * rad;
	}
}