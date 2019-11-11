//70
package com.lara.pack08.thlifeCycle;

class B extends Thread
{
	@Override
	public void run()
	{
		System.out.println("begin:");
		try
		{
			System.out.println("befor sleeping run state=:"+this.getState());
			Thread.sleep(10000);
			System.out.println("after sleeping run 10000ms:-"+this.getState());
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
public class Manager3
{
	public static void main(String[] args)
	{
		B b1 = new B();
		System.out.println("child thread state:"+b1.getState());
		b1.start();
		System.out.println("child thread state22:"+b1.getState());
		try
		{
			System.out.println("before sleeping main thread 5000ms "+Thread.currentThread().getState());
			Thread.sleep(5000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("after sleeping main thread 5000ms:"+Thread.currentThread().getState());
		
		System.out.println("child state->"+b1.getState());
	}
}

/*

when the thread is in sleeping state what is the state of that thread
timed_waiting
*/