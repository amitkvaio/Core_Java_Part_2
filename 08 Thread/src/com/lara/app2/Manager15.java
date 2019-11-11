package com.lara.app2;

class N extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 30; i++)
		{
			System.out.println("run=" + i);
		}
	}
}

public class Manager15
{
	public static void main(String[] args)
	{
		N n1 = new N();
		n1.start();
		System.out.println(n1.isAlive());
		System.out.println(n1.isDaemon());
		System.out.println("done");

	}
}
