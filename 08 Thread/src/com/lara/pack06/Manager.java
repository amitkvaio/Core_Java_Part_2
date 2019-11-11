//66
//using synchronized block
package com.lara.pack06;

class A
{
	void test1()
	{
		System.out.println("test1 begin");
		
		synchronized(this)
		{
			try
			{
				wait();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
		System.out.println("test1 end:");
	}
	
	
	void test2()
	{
		System.out.println("test2 begin");
		synchronized (this)
		{
			notifyAll();
		}
		System.out.println("test2-end");
	}
}

class B extends Thread
{
	A obj;
	B(A obj)
	{
		this.obj=obj;
	}
	
	@Override
	public void run()
	{
		System.out.println("run begin");
		obj.test1();
		System.out.println("run end");
		
	}
}

public class Manager
{
	public static void main(String[] args)
	{
		A a = new A();
		B b = new B(a);
		
		b.start();
		try
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		a.test2();
	}
}
