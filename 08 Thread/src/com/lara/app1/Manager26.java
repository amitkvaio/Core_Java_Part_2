
package com.lara.app1;

public class Manager26
{
	public static void main(String[] args)
	{
		new Thread(new Runnable()
		{
			public void run()
			{
				for (int i = 0; i < 100; i++)
				{
					System.out.println(i);
				}
			}
		}).start();
		for (int i = 100; i < 200; i++)
		{
			System.out.println(i);
		}
	}
}
