package com.lara.app2;

class O extends Thread
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

public class Manager16
{
	public static void main(String[] args)
	{
		O obj1 = new O();
		obj1.setDaemon(true);
		obj1.start();
		System.out.println(obj1.isDaemon());
		System.out.println("done");
	}
}
/*
before starting the thread we can change Daemon status of child thread
but we can not change the daemon status of main thread
because main thread is already started child thread is the Daemon thread.

once the child thread become the Daemon thread -  
	so it is leaving from the execution along with the main thread
*/