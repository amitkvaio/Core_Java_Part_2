package com.lara.app2;

class Y extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 50000; i++)
		{
			System.out.println(i + "=;" + isInterrupted());
		}
	}
}

public class Manager25
{
	public static void main(String[] args)
	{
		Y y1 = new Y();
		y1.start();
		ThreadUtil.sleep(1);
		y1.interrupt();
		System.out.println("done");
	}
}
/*
Java.lang.Thread.Interrupted( ):-
A thread can interrupt another sleeping or waiting thread. 
	But one thread is able to interrupted only another sleeping or waiting thread.
To interrupt a thread use Thread class interrupt() method.
Public void interrupt()

NOTE:- The interrupt() is effected whenever our thread enters into waiting state or 
	sleeping state and if the our thread doesn’t enters into the waiting/sleeping state 
	interrupted call will be wasted.
*/