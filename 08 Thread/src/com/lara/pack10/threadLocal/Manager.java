//- using ThreadLoca class
package com.lara.pack10.threadLocal;

class Util
{
	static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

class A extends Thread
{
	ThreadLocal t;
	
	 A(ThreadLocal t)
	{
		this.t=t;
	}
	 
	 @Override
	public void run()
	{
		System.out.println("1:"+t.get());
		t.set(10);
		Util.sleep(1000);
		
		System.out.println("2:"+t.get());
		t.set(20);
		Util.sleep(1000);
		
		System.out.println("3:"+t.get());
		t.set(30);
		Util.sleep(1000);
		
		System.out.println("4:"+t.get());
		t.set(40);
	}
}

class B extends Thread
{
	ThreadLocal t;
	
	B(ThreadLocal t)
	{
		this.t=t;
	}
	 
	 @Override
	public void run()
	{
		System.out.println("5:"+t.get());
		t.set(50);
		Util.sleep(1000);
		
		System.out.println("6:"+t.get());
		t.set(60);
		Util.sleep(1000);
		
		System.out.println("7:"+t.get());
		t.set(70);
		Util.sleep(1000);
		
		System.out.println("8:"+t.get());
		t.set(80);
	}

}
public class Manager
{
	public static void main(String[] args)
	{
		ThreadLocal t1 = new ThreadLocal();
		t1.set(90);
		
		A a1 = new A(t1);
		a1.start();
		Util.sleep(4000);
		
		B b1= new B(t1);
		b1.start();
		Util.sleep(8000);
		System.out.println("9:"+t1.get());
		
	}
}
/*
output
1:null
2:10
3:20
4:30
5:null
6:50
7:60
8:70
9:90

-ThreadLocal
- TL is a class under java.lang package developed by sun developer
- Here TL class using by main thread and two different child thread
- if any thread calling get() method without setting the value then it will return the null values as above
- Even though TL is the global thread but is is not sharing that values inside the another thread.
- whatever we set inside main thread that is not reflected into the other child thread.
*/
