//67
package com.lara.pack07;
class Thread1 extends Thread
{
	public synchronized void run()
	{
		System.out.println("run-begin");
		try
		{
			wait();
			System.out.println("run-end");
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class Manager7
{
	public static void main(String[] args)
	{
		Thread1 t1 = new Thread1();
		t1.start();
		try
		{
			Thread.sleep(20000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
// notify the waiting stage thread through the synchnonized block
		synchronized(t1)
		{
			t1.notify();
		}
	}
	
	
}
