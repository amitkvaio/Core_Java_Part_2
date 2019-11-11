//65 - notifyAll() method
package com.lara.pack05;

class Util{
	public static void sleep(long time) {
		try
		{
			Thread.sleep(time);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
class A
{
	synchronized void test1()
	{
		try
		{
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + " -is going to waiting stage--");
			wait();
			System.out.println("Resuming remaing task shorlty by thread : "+t.getName());
			Util.sleep(5000);
			for(int i=0;i<=1;i++) {
				System.out.println("Task resumet by thead "+t.getName() +"-i->"+i);
			}
			
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	synchronized void test2()
	{
		//notify();
		notifyAll();
		//notified all the thread for those thread went into the waiting stage by using the 
		//same object lock
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
		System.out.println("B-run-begin");
		obj.test1();
		System.out.println("B-run-end");
	}
}

class C extends Thread
{
	A obj;
	C(A obj)
	{
		this.obj=obj;
	}
	
	@Override
	public void run()
	{
		System.out.println("C-run-begin");
		obj.test1();
		System.out.println("C-run-end");
	}
}

class D extends Thread
{
	A obj;
	D(A obj)
	{
		this.obj=obj;
	}
	
	@Override
	public void run()
	{
		System.out.println("D-run-begin");
		obj.test1();
		System.out.println("D-run-end");
	}
}

public class Manager
{
	public static void main(String[] args)
	{
		 A a1 = new A();
		 A a2 = new A();
		 
		 B b1 = new B(a1);
		 C c1 = new C(a1);
		 D d1 = new D(a1);
		 
		 b1.start();
		 c1.start();
		 d1.start();
		 
		 try
		{
			System.out.println("Main thread is sleeping about 10 second");
			Thread.sleep(10000);
		} 
		 catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		 
		 System.out.println("about to release");
		 a1.test2();
		// a2.test2();
	}
}
