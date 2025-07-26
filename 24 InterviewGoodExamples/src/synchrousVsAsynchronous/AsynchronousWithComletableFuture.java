package synchrousVsAsynchronous;

import java.util.concurrent.CompletableFuture;

public class AsynchronousWithComletableFuture {
	public static void main(String[] args) {
		System.out.println("Task 1: Start");

		CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
			System.out.println("Task 2: Performing...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Task 2: Completed");
		});

		System.out.println("Task 3: End");

		// Ensuring the main thread waits for async task to complete
		future.join();
	}
}
/*
Java provides CompletableFuture for better asynchronous programming.
Task 1: Start
Task 3: End
Task 2: Performing...
Task 2: Completed

This example uses CompletableFuture.runAsync(), 
	which runs the task in a separate thread while the main program continues.

*/