package com.lara.app2;
class K extends Thread
{
	
}
public class Manager10
{
	public static void main(String[] args)
	{
		K k1 = new K();
		System.out.println("Child Thread Priority->"+k1.getPriority());//getting child thread priority
		Thread t1 = Thread.currentThread();//getting the reference of main thread.
		System.out.println("Main Thread Priority->"+t1.getPriority());
		
		t1.setPriority(8);
		System.out.println("Main Thread Priority after setting to 8->"+t1.getPriority());
		
		K k2 = new K();
		System.out.println("Child Thread Priority->"+k2.getPriority());
		System.out.println("done");
	}
}
/*

Thread Priorities:-
1. Every Thread in java has some property. 
	It may be default priority provided by the JVM or customized priority provided by the programmer.
2. The valid range of thread priorities is 1 – 10. Where one is lowest priority and 10 is highest priority.
3. The default priority of main thread is 5. The priority of child thread is inherited from the parent.
4. Thread defines the following constants to represent some standard priorities.
5. Thread Scheduler will use priorities while allocating processor the thread which is 
	having highest priority will get chance first and the thread which is having low priority.
6. If two threads having the same priority then we can’t expect exact 
	execution order it depends upon Thread Scheduler.
7. The thread which is having low priority has to wait until completion of high priority threads.
8. Three constant values for the thread priority.
a. MIN_PRIORITY = 1
b. NORM_PRIORITY = 5
c. MAX_PRIORITY = 10
Thread class defines the following methods to get and set priority of a Thread.
Public final int getPriority()
Public final void setPriority(int priority)
Here ‘priority’ indicates a number which is in the allowed range of 1 – 10. Otherwise we will get
Runtime exception saying “IllegalArgumentException”.
Thread priority decide when to switch from one running thread to another this process is 
	called context switching.

*/