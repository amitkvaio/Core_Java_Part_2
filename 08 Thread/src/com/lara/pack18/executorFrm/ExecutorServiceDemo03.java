package com.lara.pack18.executorFrm;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class Job implements Runnable{
	String name;
	public Job(String name) {
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

public class ExecutorServiceDemo03 {
	public static void main(String[] args) {
		Job[] jobs = {
				new Job("Job 1"),
				new Job("Job 2"),
				new Job("Job 3"),
				new Job("Job 4"),
				new Job("Job 5"),
				new Job("Job 6"),
		};
		Executor executor= Executors.newFixedThreadPool(3);//1 TO 6
		for (Job Job : jobs) {
			executor.execute(Job);
			//execute, only supports Runnable jobs - it does not supports Collable jobs
		}
	}
}
