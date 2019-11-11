//Thread Group
package com.lara.pack12.threadGroup;

class A extends Thread
{
	A(ThreadGroup tg,String name)
	{
		super(tg,name);
	}
	
	@Override
	public void run()
	{
		for (int i = 0; i <100; i++)
		{
			System.out.println("class -A-for:-"+i);
		}
	}
}

class B implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 1000; i < 2000; i++)
		{
			System.out.println("class -B-for:-"+i);
		}
		
	}
}
public class Manager
{
	public static void main(String[] args)
	{ 
		ThreadGroup tg = new ThreadGroup("first group");
		
		A a1 =new A(tg, "first group");
		A a2 =new A(tg, "2nd group");
		
		B b1 = new B();
		
		Thread t1 = new Thread(tg,b1,"3rd group");
		Thread t2 = new Thread(tg,b1,"4th group");
		
		a1.start();
		a2.start();
		//t1.start();
		t2.start();
		tg.stop();
	}
}
