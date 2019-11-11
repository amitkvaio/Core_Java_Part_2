package com.lara.app2;

public class Manager22
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 2000; i++)
		{
			System.out.println("run-:" + i);
		}

		try
		{
			Thread.sleep(5000);
			System.out.println("Main thread action has been ended");
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
/*
inside the Thread class , sleep(--) is the static method 

*/