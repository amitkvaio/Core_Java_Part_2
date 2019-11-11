package com.lara.app2;

class S extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 3000; i++)
		{
			System.out.println("run:" + i);
		}
	}
}

public class Manager20
{
	public static void main(String[] args)
	{
		S s1 = new S();
		s1.start();
		try
		{
			s1.join(10);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		for (int i = 0; i < 500; i++)
		{
			System.out.println("main thread:-" + i);
		}

	}
}

/*
 s1.join() means main thread has to wait till to child thread execution got over
 then main thread has to resuming back their execution
 s1.join(10)=means main thread has to wait only 10 millisecond 
 after 10 millisecond both the thread become independent in this is case 
 we will get the simultaneous output.
 
Java.lang.Thread.join(-,-) method:-
Join method allows one thread to wait for the completion of another thread.
o t.join(); ---> here t is a Thread Object whose thread is currently running.
Join() is used to stop the execution of the thread until completion of some other Thread.

if a t1 thread is executed t2.join() at that situation t1 must wait until completion of the t2 thread.
public final void join()throws InterruptedExcetion
Public final void join(long ms)throws InterruptedException
Public final void join(long ms, int ns)throws InterruptedException
*/
