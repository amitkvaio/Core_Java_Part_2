package com.lara.app2;

public class Manager13
{
	public static void main(String[] args)
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getPriority());
		t1.setPriority(11);
		System.out.println(t1.getPriority());
		System.out.println("done");
	}
}

/*
we can not set the priority of any thread more then 10
it will give java.lang.IllegalArgumentException
*/