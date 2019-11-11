package com.lara.pack18.executorFrm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{
	String name;
	public PrintJob(String name) {
		 this.name=name;
	}
	@Override
	public void run() {
		String thName =  Thread.currentThread().getName();
		System.out.println(name +" ..Job started by ->"+thName);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name +" Jobs has completed by -->"+thName);
	}
}

public class ExecutorServiceDemo01 {
	public static void main(String[] args) {
		PrintJob[] jobs = {
				new PrintJob("Job 1"),
				new PrintJob("Job 2"),
				new PrintJob("Job 3"),
				new PrintJob("Job 4"),
				new PrintJob("Job 5"),
				new PrintJob("Job 6"),
		};
		ExecutorService service= Executors.newFixedThreadPool(3);//1 TO 6
		for (PrintJob Job : jobs) {
			service.submit(Job);
		}
		service.shutdown();
	}
}
