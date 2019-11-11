package com.lara.app2;
class H extends Thread
{
	
}

public class Manager6
{
	public static void main(String[] args)
	{
		H h1 = new H();
		H h2 = new H();
		//getting the child thread name
		System.out.println(h1.getName());
		System.out.println(h2.getName());
		//getting the main thread name
		System.out.println(Thread.currentThread().getName());
		System.out.println("..............");
		//setting the child thread name
		h1.setName("abc");
		h1.setName("xyz");
		//setting the main thread name
		Thread.currentThread().setName("Initiator");
		//Retrieving the child thread name
		System.out.println(h1.getName());
		System.out.println(h2.getName());
		//retrieving the main thread name
		System.out.println(Thread.currentThread().getName());
		
		
		
	}
}
