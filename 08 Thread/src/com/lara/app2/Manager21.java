package com.lara.app2;

class T extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 10000; i++)
		{
			System.out.println("T-run-:" + i);
		}
	}
}

class U extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 30000; i++)
		{
			System.out.println("U-run-:" + i);
		}
	}
}
public class Manager21
{
	public static void main(String[] args)
	{
		T t1 = new T();
		U u1 = new U();
		t1.start();
		u1.start();
		//we will get the simultaneous output because both the child thread stated
		try
		{
			t1.join();
			u1.join();
			//main thread has to wait till to both the child thread execution 
			//at the end of both main thread has to join
			System.out.println("Main thread end");
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("done");
	}

}

/*
 
 two child thread are t1  and u1 asking from the main thread
 once both the thread execution got over then parent thread
 execution will resuming back at the end of execution of 
 child thread
 
 
 */
