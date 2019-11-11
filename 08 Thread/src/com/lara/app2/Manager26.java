package com.lara.app2;

class Z extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 3000; i++)
		{
			if (!isInterrupted())
			{
				System.out.println("NOT INTERRUPTED=:" + i);
			} else
			{
				System.out.println("INTERRUPTED=:" + i);
			}
		}
	}
}

public class Manager26
{
	public static void main(String[] args)
	{
		Z z1 = new Z();
		z1.start();
		ThreadUtil.sleep(5);
		z1.interrupt();
		System.out.println("done");
	}
}



