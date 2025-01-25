package com.lara.pack18.callableInterface;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		String thName = Thread.currentThread().getName();
		System.out.println("**********From Client@main start**********"+thName);
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<Double> areaOfCircle=service.submit(new AreaOfACircle(12.5));
		System.out.println("Area of Circle is : "+areaOfCircle.get());
		System.out.println("=========================================");
		Future<Double> cirmcurOfCircle=service.submit(new CircumOfACircle(10));
		System.out.println("Circum Ference of circle is : "+cirmcurOfCircle.get());
		System.out.println("------------------------------");
		Future<Integer> fact=service.submit(new FactorialTask(5));
		System.out.println("Factoril of 5 is :"+fact.get());
		System.out.println("-----------------------------------------");
		Future<List<String>> liststr=service.submit(new ListString());
		System.out.println(liststr.get());
		System.out.println("**********From Client@main end**********"+thName);
	}
	
	public static void sleep(long ns) {
		try {
			Thread.sleep(ns);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
/*
ExecutorService.submit() method returns immediately and gives you a Future. 
Once you have obtained a future, we can execute other tasks in parallel while our submitted task is executing, 
and then use future.get() method to retrieve the result of the future.

Note that, the get() method blocks until the task is completed. 
The Future API also provides an isDone() method to check whether the task is completed or not -


ExecutorService is an interface in Java that allows us to manage and control threads.

Executors.newFixedThreadPool(2) creates a fixed thread pool with 2 threads. 
	This means at most 2 threads can run at the same time, handling tasks we submit to this pool.

By using a thread pool, we don’t have to create and manage threads manually. 
	The pool will handle threads efficiently, creating and reusing them as needed.

service.submit(...) submits a task to the thread pool for execution.

submit() returns a Future object, which represents the result of an asynchronous computation.

We can call areaOfCircle.get() to retrieve the result when it's ready, blocking the calling thread until the computation is complete.
*/