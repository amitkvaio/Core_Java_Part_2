package com.lara.pack18.callableInterface;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
invokeAll

Submit multiple tasks and wait for all of them to complete.

We can execute multiple tasks by passing a collection of Callables to the invokeAll() method. 
The invokeAll() returns a list of Futures. 
 	Any call to future.get() will block until all the Futures are complete.
*/

public class LInvokeAll {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		String thName = Thread.currentThread().getName();
		System.out.println("Main thread starts::"+thName);
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		Callable<String> task1 = () -> {
			Thread.sleep(2000);
			return "Result of Task1";
		};

		Callable<String> task2 = () -> {
			Thread.sleep(1000);
			return "Result of Task2";
		};

		Callable<String> task3 = () -> {
			Thread.sleep(5000);
			return "Result of Task3";
		};

		List<Callable<String>> taskList = Arrays.asList(task1, task2, task3);
		System.out.println("Main thread starts about to invoke all the callable jobs by::"+thName);
		List<Future<String>> futures = executorService.invokeAll(taskList);
		System.out.println("Main thread waiting to complete the jobs");
		for (Future<String> future : futures) {
			// The result is printed only after all the futures are complete. (i.e. after 5
			// seconds)
			System.out.println(future.get());
		}

		executorService.shutdown();
		System.out.println("Main thread completed all the operation::"+thName);
	}
}


/*
Main thread starts::main
Main thread starts about to invoke all the callable jobs by::main
Main thread waiting to complete the jobs
Result of Task1
Result of Task2
Result of Task3
Main thread completed all the operation::main

future.get() statement blocks the main thread until all the futures are complete. 
It is blocking the main thread
*/