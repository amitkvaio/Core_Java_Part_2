package com.lara.app2;

class Q extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 3000; i++)
		{
			System.out.println("run=" + i);
		}
	}
}

public class Manager18
{
	public static void main(String[] args)
	{
		Q q = new Q();
		q.start();
		System.out.println("done");
	}
}
/*
 main thread is leaving form the execution is very soon
 child thread is the user thread it continue to execute
 assign task, even main thread is leaving from the execution.

*/