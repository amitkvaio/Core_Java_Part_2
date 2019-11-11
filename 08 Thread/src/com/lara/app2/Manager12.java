package com.lara.app2;

class L extends Thread
{
	@Override
	public void run()
	{
		System.out.println("L:" + getPriority());
	}
}

class M extends Thread
{
	@Override
	public void run()
	{
		System.out.println("M:" + getPriority());
		setPriority(8);
		L obj = new L();
		obj.start();
	}
}

public class Manager12
{
	public static void main(String[] args)
	{
		Thread t1 = Thread.currentThread();
		t1.setPriority(6);
		M m1 = new M();
		m1.start();
		System.out.println("done");
	}
}
/*
 * default priority of child thread is parents priority .
 * 
 * 
 */