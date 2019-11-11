
//72
package com.lara.pack08.thlifeCycle;
class D extends Thread
{
	Thread main;
	public D(Thread main)
	{
		this.main=main;
	}
	
	@Override
	public void run()
	{
		try
		{
			System.out.println("Thread STATE->"+Thread.currentThread().getState());
			Thread.sleep(2000);
			//main thread has to wait for this main thread state is - WAITING state
			System.out.println("Thread STATE->"+main.getState());
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}
public class Manager5
{
	public static void main(String[] args)
	{
		Thread main = Thread.currentThread();
		D d1 = new  D(main);
		d1.start();
		
		try
		{
			// main thread has to wait till the execution of run method
			d1.join();
			System.out.println("Main thread resumed their work");		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
