package com.lara.app1;

class L extends Thread
{
	public void run()
	{
		System.out.println("begin");
		start();
		//this.start();
		System.out.println("end");
		
	}
}

public class Manager09
{
	public static void main(String[] args)
	{
		L l1 = new L();
		l1.start();
		for (int i = 0; i < 100; i++)
		{

		}
		System.out.println("done");
	}
}

// we can not call the start method twice it will throws an exception saying IllegalThreadStateException