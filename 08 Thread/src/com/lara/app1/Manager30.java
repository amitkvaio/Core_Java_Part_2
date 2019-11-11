package com.lara.app1;

public class Manager30
{
	public static void main(String[] args)
	{
		new Thread(new Runnable()
		{
			public void run()
			{
				System.out.println("Runnable");
			}
		}).start();
	}
}
