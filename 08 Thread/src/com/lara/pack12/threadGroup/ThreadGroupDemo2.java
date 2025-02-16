package com.lara.pack12.threadGroup;

public class ThreadGroupDemo2 {
	public static void main(String[] args) {
		ThreadGroup g1 = new ThreadGroup("tg");
		
		Thread t1 = new  Thread(g1, "Thread 1");
		Thread t2= new  Thread(g1, "Thread 2");
		
		g1.setMaxPriority(3);
		Thread t3 = new  Thread(g1, "Thread 3");
		Thread t4 = new  Thread(g1, "Thread 4");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		System.out.println(t4.getPriority());
	}
}
