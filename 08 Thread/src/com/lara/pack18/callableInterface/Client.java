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
*/