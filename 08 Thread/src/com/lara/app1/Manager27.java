package com.lara.app1;

public class Manager27
{
	public static Runnable getRunnable()
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
		return r1;
	}

	public static void main(String[] args)
	{
		Thread t1 = new Thread(getRunnable());
		t1.start();
		for (int i = 100; i < 200; i++)
		{
			System.out.println(i);
		}
	}

}
