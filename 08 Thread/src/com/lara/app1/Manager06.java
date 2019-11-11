package com.lara.app1;
class Thread1 extends Thread
{
	public void run()
	{
		for (int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}
public class Manager06
{
	public static void main(String[] args)
	{
		Thread1 t1 = new Thread1();
		t1.start();
		for (int i = 1000; i < 2000; i++)
		{
			System.out.println(i);
		}
	}
}
/*

A thread can be created in two ways:-
1) By extending Thread class.
2) By implementing java.lang.Runnable interface

First approach to create thread extending Thread class:-

Step 1:- Our normal java class will become Thread class whenever we are 
	extending predefined Thread class.
	class MyThread extends Thread
	{
	};

Step 2:- override the run() method to write the business logic of the 
	Thread( run() method present in Thread class).
class MyThread extends Thread
{ 
	public void run()
	{ 
		System.out.println("business logic of the thread");
		System.out.println("body of the thread");
	}
}
Step 2:- Create user defined Thread class object.
	MyThread t=new MyThread();

Step 3:- Start the Thread by using start() method of Thread class.
t.start();

Flow of execution:-
1) Whenever we are calling t.start() method then JVM will search start() method in the 
	MyThread class since not available so JVM will execute parent class(Thread) start() method.
	Thread class start() method responsibilities
a. User defined thread is registered into Thread Scheduler then only decide new Thread has created.
b. The Thread class start() automatically calls run() to execute logics of user defined Thread.

Thread Scheduler:-
Thread scheduler is a part of the JVM. It decides thread execution.
Thread scheduler is a mental patient we are unable to predict exact behavior 
	of Thread Scheduler it is JVM vendor dependent.
Thread Scheduler mainly uses two algorithms to decide Thread execution.
1) Preemptive algorithm.
2) Time slicing algorithm.
We can’t expect exact behavior of the thread scheduler it is JVM vendor dependent. 
	So we can’t say expect output of the multi threaded examples we can say the possible outputs.

Preemptive scheduling:-
In this highest priority task is executed first after this task enters into waiting 
	state or dead state then only another higher priority task come to existence.

Time Slicing Scheduling:-
A task is executed predefined slice of time and then return pool of ready tasks. 
	The scheduler determines which task is executed based on the priority and other factors.
Example :-is it possible to start a thread twice : no


*/