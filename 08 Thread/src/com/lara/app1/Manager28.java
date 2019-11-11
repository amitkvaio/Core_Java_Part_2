package com.lara.app1;

public class Manager28
{
	static Thread getThread()
	{
		return new Thread()
		{
			public void run()
			{
				for (int i = 0; i < 100; i++)
				{
					System.out.println(i);
				}
			}
		};
	}

	public static void main(String[] args)
	{
		Thread t1 = new Thread(getThread());
		t1.start();
		getThread().start();
		System.out.println("------");
		for (int i = 100; i < 200; i++)
		{
			System.out.println(i);
		}
	}
}

/*
 * Thread is the subclass of the Runnable . we are creating the thread object by
 * supply an object to to the subclass of runnable. this is the 2nd way of
 * creating the thread.
 * 
 */