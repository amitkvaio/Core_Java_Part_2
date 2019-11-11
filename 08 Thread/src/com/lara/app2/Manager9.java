package com.lara.app2;

public class Manager9
{
	public static void main(String[] args)
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getPriority());// getting the current thread priority
		t1.setPriority(9);// setting the priority
		System.out.println(t1.getPriority());// getting the priority
		System.out.println("done");
	}
}
