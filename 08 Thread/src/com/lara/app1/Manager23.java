package com.lara.app1;

public class Manager23
{
	public static void main(String[] args)
	{
		Runnable r1 = new Runnable()
		{
			public void run()
			{
				for (int i = 0; i < 100; i++)
				{
					System.out.println(i);
				}
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		for (int i = 100; i < 200; i++)
		{
			System.out.println(i);
		}
	}
}
