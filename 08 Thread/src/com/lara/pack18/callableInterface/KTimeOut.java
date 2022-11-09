package com.lara.pack18.callableInterface;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class KTimeOut {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		KTimeOut kTimeOut = new  KTimeOut();
		kTimeOut.timout();
		System.out.println("********* Main method done*********");
	}

	private void timout() throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<String> future = executorService.submit(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
			 
			return "Hello from Callable timeout";
		});

		System.out.println("******* Waiting for timeout *****");
		future.get(6, TimeUnit.SECONDS);
		
		String result = future.get();
		System.out.println(result);

		executorService.shutdown();
	}
}
