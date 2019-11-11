package com.lara.app2;

public class Manager3
{
	public static void main(String[] args)
	{
		System.out.println("default properties of main thread");
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
		System.out.println("..........");
	}
}
