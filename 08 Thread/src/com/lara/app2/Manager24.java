package com.lara.app2;

class ThreadUtil
{
	static void sleep(long milis)
	{
		try
		{
			Thread.sleep(milis);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

class W extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 20; i++)
		{
			System.out.println("W-run-:repeat in 1 second-" + i);
			ThreadUtil.sleep(1000);
		}
	}
}

class X extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("X-run-:repeat in 10 second-" + i);
			ThreadUtil.sleep(10000);
		}
	}
}

public class Manager24
{
	public static void main(String[] args)
	{
		W w1 = new W();
		w1.start();

		X x1 = new X();
		x1.start();

		for (int i = 300; i < 305; i++)
		{
			System.out.println("Main-:repeat in 12 second-" + i);
			ThreadUtil.sleep(12000);
		}
		System.out.println("Main thread action has been finished");
	}
}
