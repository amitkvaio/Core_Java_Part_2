package com.lara.app2;

class V extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for (int i = 0; i < 200; i++)
			{
				System.out.println("V-run-:" + i);
			}
			
			sleep(10000);
			
			System.out.println("done V CLASS");
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

public class Manager23
{
	public static void main(String[] args)
	{
		V v1 = new V();
		v1.start();

		try
		{
			for (int i = 0; i < 1000; i++)
			{
				System.out.println("Main-:" + i);
			}
			Thread.sleep(1000);
			System.out.println("done manager23");
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
