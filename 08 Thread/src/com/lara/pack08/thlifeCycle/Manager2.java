//69
package com.lara.pack08.thlifeCycle;
class A extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println(i);
		}
	}
}

public class Manager2
{
	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println("before starting:-"+a1.getState() +" Thrad Name : "+Thread.currentThread().getName());
		
		a1.start();
		System.out.println("after starting:-"+a1.getState()+" Thrad Name : "+Thread.currentThread().getName());
		
		try
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("after try-sleeping for 1  second:-"+a1.getState() +" Thrad Name : "+Thread.currentThread().getName());
	}
}
