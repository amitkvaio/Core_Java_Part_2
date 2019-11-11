package com.lara.pack13.countdwonLatch;

class A
{
	//some members
}

class B extends Thread
{
	//several attributes
	@Override
	public void run()
	{
		//some stms
	}
}

class C extends A implements Runnable
{
	//several attribute
	public void run() {};
}
public class Manager13
{
	public static void main(String[] args)
	{
		 B b1 = new B();
		 b1.start();
		 
		 B b2 = new B();
		 b2.start();
		 
		 C c1 = new C();
		 
		 Thread t1 = new Thread(c1);
		 Thread t2 = new Thread(c1);
		 t1.start();
		 t2.start();
	}
}
