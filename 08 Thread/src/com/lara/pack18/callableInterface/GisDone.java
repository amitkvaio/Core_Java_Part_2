package com.lara.pack18.callableInterface;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/*
The Future API also provides an isDone() method to check whether the task is completed or not -
*/
public class GisDone {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Future<String> future = executorService.submit(() -> {
			Thread.sleep(1000);
			return "Hello from Callable";
		});

		while (!future.isDone()) {
			System.out.println("Task is still not done...");
			Thread.sleep(100);
		}

		System.out.println("Task completed! Retrieving the result");
		String result = future.get();
		System.out.println(result);

		executorService.shutdown();
		System.out.println("Main method done");
	}
}
/*
Task is still not done...
Task is still not done...
Task is still not done...
Task is still not done...
Task is still not done...
Task is still not done...
Task is still not done...
Task completed! Retrieving the result
Hello from Callable
Main method done
https://www.callicoder.com/java-callable-and-future-tutorial/
*/