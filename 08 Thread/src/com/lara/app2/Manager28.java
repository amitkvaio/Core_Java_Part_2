package com.lara.app2;

class Thread2 extends Thread
{
	@Override
	public void run()
	{
		try
		{
			sleep(10000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("child thread isinterrupted : -"+isInterrupted());
	}
}

public class Manager28
{
	public static void main(String[] args)
	{
		Thread2 t1 = new Thread2();
		t1.start();
		System.out.println("Main thread is sleeping for 5 second");
		ThreadUtil.sleep(5000);
		System.out.println("Main thread is sleeping for 2 second");
		ThreadUtil.sleep(2000);
		t1.interrupt();
		System.out.println("done");
	}
}
