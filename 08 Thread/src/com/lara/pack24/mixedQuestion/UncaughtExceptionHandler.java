package com.lara.pack24.mixedQuestion;

class Horse implements Runnable{
	String str;
	@Override
	public void run() {
		if(str.equals("abc")) {
			System.out.println("--------EQUAL-------");
		}
	}
}

public class UncaughtExceptionHandler {
	public static void main(String[] args) {
		Horse horse = new Horse();
		Thread th = new Thread(horse, "Thread-1");
		
		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println(t.getName() + " has thrown " + e);
			}
		});
		
		th.start();
		System.out.println("Finished!!!");
	}
}
