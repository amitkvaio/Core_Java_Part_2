package com.lara.pack18.callableInterface;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ICancelFuture {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		long startTime = System.nanoTime();
		Future<String> future = executorService.submit(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
			//Thread.sleep(1000);
			return "Hello from Callable";
		});

		while (!future.isDone()) {
			System.out.println("Task is still not done...");
			Thread.sleep(7000);
			double elapsedTimeInSec = (System.nanoTime() - startTime) / 1000000000.0;

			if (elapsedTimeInSec > 1) {
				future.cancel(true);
			}
		}

		if (!future.isCancelled()) {
			System.out.println("Task completed! Retrieving the result");
			String result = future.get();
			System.out.println(result);
		} else {
			System.out.println("Task was cancelled");
		}
		executorService.shutdown();
	}
}
