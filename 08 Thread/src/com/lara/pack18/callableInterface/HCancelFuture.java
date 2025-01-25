package com.lara.pack18.callableInterface;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 Cancelling a Future
 */
public class HCancelFuture {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		long startTime = System.nanoTime();
		Future<String> future = executorService.submit(() -> {
			Thread.sleep(2000);
			return "Hello from Callable";
		});

		while (!future.isDone()) {
			System.out.println("Task is still not done...");
			Thread.sleep(200);
			double elapsedTimeInSec = (System.nanoTime() - startTime) / 1000000000.0;

			if (elapsedTimeInSec > 1) {
				System.out.println("Cancel the future>>>>>");
				future.cancel(true);
			}
		}

		System.out.println("Task completed! Retrieving the result");
		String result = future.get();
		System.out.println(result);

		executorService.shutdown();
	}
}
/*

We can cancel a future using Future.cancel() method. 
It attempts to cancel the execution of the task and returns true 
	if it is cancelled successfully, otherwise, it returns false.

The cancel() method accepts a boolean argument - mayInterruptIfRunning. 
	If you pass the value true for this argument, then the thread that is currently executing 
	the task will be interrupted, otherwise in-progress tasks will be allowed to complete.
	
Output
Task is still not done...
Task is still not done...
Task is still not done...
Task is still not done...
Task is still not done...
Task completed! Retrieving the result
Exception in thread "main" java.util.concurrent.CancellationException
        at java.util.concurrent.FutureTask.report(FutureTask.java:121)
        at java.util.concurrent.FutureTask.get(FutureTask.java:192)
        at FutureCancelExample.main(FutureCancelExample.java:34)

it will throw an exception, because future.get() method throws CancellationException 
	if the task is cancelled. We can handle this fact by checking whether 
	the future is cancelled before retrieving the result -
*/