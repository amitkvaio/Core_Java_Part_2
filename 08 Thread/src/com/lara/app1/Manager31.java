package com.lara.app1;

public class Manager31
{
	static Runnable getRunnable()
	{
		return new Runnable()
		{
			public void run()
			{
				System.out.println("Ruunable");
			}
		};
	}

	public static Thread getThread()
	{
		return new Thread()
		{
			public void run()
			{
				System.out.println("Thread");
			}
		};
	}

	public static Thread getThread1()
	{
		return new Thread()
		{
			public void run()
			{
				System.out.println("Thread1");
			}
		};
	}

	public static Thread getThread2()
	{
		return new Thread(new Runnable()
		{
			public void run()
			{
				System.out.println("Runnable1");
			}
		})
		{
			public void run()
			{
				System.out.println("Thread2");
			}
		};
	}

	public static void main(String[] args)
	{
		new Thread(getRunnable()).start();
		getThread().start();
		getThread1().start();
		getThread2().start();
		System.out.println("done");
	}

}
