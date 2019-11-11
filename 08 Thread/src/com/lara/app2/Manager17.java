package com.lara.app2;
class P extends Thread
{
	@Override
	public void run()
	{
		System.out.println("something");
	}
}
public class Manager17
{
	public static void main(String[] args)
	{
		P p1 = new P();
		p1.start();
		p1.setDaemon(true);
		System.out.println("done");
	}
}
