package com.lara.pack24.mixedQuestion;

public class ShutDownHook {
	public static void main(String[] args) {
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("From the run method");
			}
		});
		
		try {
			String thName = Thread.currentThread().getName();
			for (int i = 1; i <=50; i++) {
				System.out.println(thName + " -->"+i);
				Thread.sleep(250);
			}
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
	}
}
/*
A shutdown hook is a thread that gets executed when the JVM shuts down.
*/