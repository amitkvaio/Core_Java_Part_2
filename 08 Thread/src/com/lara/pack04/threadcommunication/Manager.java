//64-- enter thread communication
package com.lara.pack04.threadcommunication;

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
		System.out.println("test1 begin");
		Thread t = Thread.currentThread();
		
		try
		{
			System.out.println(t.getName() + " -is going to waiting stage--");
			wait();
			/*
				when ever thread is calling wait() method then thread is going into the
				waiting stage and it is not defined how many millisecond.
				Without knowing how long to go to waiting state.
				it may be infinite amount of time that is why it releasing the object lock when
				it going to the waiting stage.
				
				but in case of sleep method we specify the time in millisecond due to that is is
				not released the object lock.
			*/
			System.out.println("Resuming remaing task shorlty by thread :"+t.getName());
			Util.sleep(3000);
			for(int i=0;i<=2;i++) {
				System.out.println("--from test1-->"+i);
			}
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("************test1 end**************");
		
	}
	synchronized void test2()
	{
		System.out.println("from synchronized test2 called and from it notify() method called");
		this.notify();
	}
}

class Thread1 extends Thread
{
	A a1;
	Thread1(A a1)
	{
		this.a1=a1;
	}
	
	@Override
	public void run()
	{
		a1.test1();
	}
}


class Thread2 extends Thread
{
	A a1;
	Thread2(A a1)
	{
		this.a1=a1;
	}
	
	@Override
	public void run()
	{
		a1.test1();
	}
}
public class Manager
{
	public static void main(String[] args)
	{
		A a1= new A();
		Thread1 t1 = new Thread1(a1);
		Thread2 t2 = new Thread2(a1);
		t1.start();
		t2.start();
		
		System.out.println("Main thread is sleeping for 10 second");
		System.out.println("thereafter one sleeping thread willwakeup");
		Util.sleep(10000);
		a1.test2();
		
		System.out.println("AgainMain thread is sleeping for 10 second");
		System.out.println("thereafter second sleeping thread willwakeup");
		Util.sleep(10000);
		a1.test2();
		System.out.println("done");
	}
}
/*
Here two thread went into the waiting stage.
the object lock is not with the t1 and t2.
object lock is available inside the object itself.

Main thread is sleeping for 20 second. but the child thread is under the waiting stage.

test2 method is synchronized - main thread required the object lock of a1 and it is available.
	so it will call the test2 method inside that notify() method being called.
	whenever calling the notify () method randomly one thread notify and one thread
	will released from the waiting stage
	only one thread randomly getting notification.

and join test1() method here object lock is required - main thread releasing the object lock.
	test1() taking this object lock and printing the remaining portion of test1() and releasing the lock.
	
-- but one thread still under waiting stage so it is keep on waiting for notification but
the main thread and child thread both has released the object lock.

wait(), notify() and notifyAll() method are present in the object class not in the thread class
because Thread can call these method on any common object

*/