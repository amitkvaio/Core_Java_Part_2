package com.lara.pack24.mixedQuestion;

public class UncaughtExceptionExample {
	public static void main(String[] args) {
		Task task = new Task();
		Thread thread = new Thread(task);
		
		
		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println(t.getName() + " has thrown-- " + e);
			}
		});
		thread.start();
	}
}

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.parseInt("234"));
		System.out.println(Integer.parseInt("345"));
		System.out.println(Integer.parseInt("XYZ")); // This will cause NumberFormatException
		System.out.println(Integer.parseInt("456"));
	}
}

//https://howtodoinjava.com/java/multi-threading/how-to-restart-thread-using-uncaughtexceptionhandler/