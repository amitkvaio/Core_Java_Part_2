package com.lara.app2;

class Thread1 extends Thread
{
	@Override
	public void run()
	{
		try
		{
			sleep(2000);

		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(isInterrupted());
		System.out.println("...........");
		ThreadUtil.sleep(5000);
		this.interrupt();
		System.out.println(isInterrupted());
		System.out.println("****************************");
	}
}

public class Manager27
{
	public static void main(String[] args)
	{
		Thread1 t1 = new Thread1();
		t1.start();
		System.out.println("done");
	}
}
