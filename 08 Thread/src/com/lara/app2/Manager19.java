package com.lara.app2;
class R extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 3000; i++)
		{
			System.out.println(i);
		}
	}
}
public class Manager19
{
	public static void main(String[] args)
	{
		R r1 = new R();
		System.out.println(r1.isDaemon());
		r1.setDaemon(true);//child is become the daemon thread .
		System.out.println(r1.isDaemon());
		//so it is leaving from the execution along with the main thread
		r1.start();
		System.out.println("done");
	}
}
