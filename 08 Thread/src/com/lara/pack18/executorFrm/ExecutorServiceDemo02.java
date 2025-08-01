package com.lara.pack18.executorFrm;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Integer>{
	int num;
	public MyCallable(int num) {
		this.num=num;
	}

	@Override
	public Integer call() throws Exception {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + " is responsible to find the sum of first " + num + " numbers");
		int sum=0;
		for (int i = 1; i <=num; i++) {
			sum=sum+i;
		}
		return sum;
	}
	
}
public class ExecutorServiceDemo02 {
	public static void main(String[] args) throws Exception {
		MyCallable [] jobs = {
								new MyCallable(10),
								new MyCallable(20),
								new MyCallable(30),
								new MyCallable(40),
								new MyCallable(50),
								new MyCallable(60),
							 };
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (MyCallable job : jobs) {
			Future<Integer> f = service.submit(job);
			System.out.println("Sum is : "+f.get());
		}
		service.shutdown();
	}
}
