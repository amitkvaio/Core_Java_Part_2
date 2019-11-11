package com.lara.app1;

public class Manager29
{
	static Thread getThread()
	{
		return new Thread(new Runnable()
		{
			public void run()
			{
				for (int i = 0; i < 100; i++)
				{
					System.out.println(i);
				}
			}
		});
	}

	public static void main(String[] args)
	{
		Thread t1 = getThread();
		t1.start();
		getThread().start();
		System.out.println("------");
		for (int i = 100; i < 200; i++)
		{
			System.out.println(i);
		}
	}
}
