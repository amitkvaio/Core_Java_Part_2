//63 
//Deadlock
package com.lara.pack03.deadlock;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
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
class Shared
{
	synchronized void test1(Shared s)//s=s2 object
	{
		System.out.println("test1 start");
		Util.sleep(1000);
		s.test2(this);
		System.out.println("test1 end");
	}
	/*
	 calling test2 method and looking for s2 object
	 and s2 is with the second thread.
	 s1 object lock will be release when the test1 execution got over.
	 */
	
	
	synchronized void test2(Shared s)//s=s1
	{
		System.out.println("test2 start");
		Util.sleep(1000);
		s.test1(this);
		System.out.println("test2 end");
	}
	
	/*
	 calling test1 method and looking for s1 object
	 and s1 is with the first thread.
	 s2 object lock will be release when the test2 execution got over.
	 */
}

class A extends Thread
{
	Shared s1,s2;
	A(Shared s1,Shared s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	
	@Override
	public void run()
	{
		s1.test1(s2);
		/*
			test1 is the synchronized method so it will take the object lock of s1 and
			it will execute the test1 method by passing s2 object as parameter.
			
		*/
	}
}

class B extends Thread
{
	Shared s1,s2;
	B(Shared s1,Shared s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	
	@Override
	public void run()
	{
		s2.test2(s1);
	}
	/*
		taking object lock of s2, and giving a call to test2 method which is synchronized.
		by passing s1 object as parameter.- it is looking the object lock of s1.
	*/
}

public class Manager
{
	public static void main(String[] args)
	{
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		
		A a1 = new A(s1,s2);
		B b1 = new B(s1, s2);
		a1.start();
		b1.start();
		
		System.out.println("done");
		Util.sleep(2000);
		
		ThreadMXBean tx = ManagementFactory.getThreadMXBean();
		
		long ids[]=tx.findDeadlockedThreads();
		
		if(ids!=null)
		{									
			System.out.println("dead locked threads are:");
			
			ThreadInfo[] ti=tx.getThreadInfo(ids);
			
			ThreadInfo thInfo = null;
			
			for (int i = 0; i < ti.length; i++)
			{
				thInfo=ti[i];
				
				System.out.println(thInfo.getThreadName());
			}
		}
		else
		{
			System.out.println("no threads are under locked");  
		}

	}
}
