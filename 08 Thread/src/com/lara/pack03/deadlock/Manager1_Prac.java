package com.lara.pack03.deadlock;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

class Utill
{
	public static void sleep(long lg) {
		try
		{
			Thread.sleep(lg);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
class DeadLock
{
	synchronized void test1(DeadLock d1) {
		System.out.println("test1- start");
		Utill.sleep(1000);
		d1.test2(this);
		System.out.println("test1- end");
	}
	
	synchronized void test2(DeadLock d2) {
		System.out.println("test2- start");
		Utill.sleep(1000);
		d2.test1(this);
		System.out.println("test2- end");
		
	}
}
class Amit extends Thread
{
	DeadLock d1,d2;
	
	Amit(DeadLock d1,DeadLock d2) {
		this.d1=d1;
		this.d2=d2;
	}
	
	@Override
	public void run()
	{
		d1.test1(d2);
	}
}

class Kumar extends Thread
{
	DeadLock d1,d2;
	
	Kumar(DeadLock d1,DeadLock d2) {
		this.d1=d1;
		this.d2=d2;
	}
	
	@Override
	public void run()
	{
		d2.test2(d1);
	}
}


public class Manager1_Prac
{
	public static void main(String[] args)
	{
		System.out.println("main method start");
		
		DeadLock dk1 = new DeadLock();
		DeadLock dk2= new DeadLock();
		Amit a = new Amit(dk1, dk2);
		Kumar k = new Kumar(dk1, dk2);
		a.start();
		k.start();
		Utill.sleep(5000);
		
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
		System.out.println("main mehod end");
	}
}
