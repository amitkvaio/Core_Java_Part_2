package com.lara.app2;

public class Manager14
{
	public static void main(String[] args)
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.isDaemon());
		//t1.setDaemon(true);
		//System.out.println(t1.isDaemon());
		System.out.println("done");
		
	}
}
/*
before starting the thread we can change the status of Daemon thread
here, main thread is started so we can not change the status of
main thread.because main thread is already started.

*/