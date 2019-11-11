package com.lara.app2;

class Thread3 extends Thread
{
	@Override
	public void run()
	{
		ThreadUtil.sleep(10000);
		for (int i = 0; i < 5000; i++)
		{
			System.out.println("Thread3-run:-" + i);
		}
	}
}

public class Manager29
{
	public static void main(String[] args)
	{
		Thread3 t1 = new Thread3();
		t1.start();
		ThreadUtil.sleep(2000);
		t1.interrupt();
		System.out.println("done");
	}
}
