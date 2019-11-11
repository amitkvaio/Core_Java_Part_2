//68
package com.lara.pack08.thlifeCycle;

public class Manager1
{
	public static void main(String[] args)
	{
		Thread.State states[]=Thread.State.values();
		//State is the inner enum in the Thread class
		for (Thread.State s1 : states)
		{
			System.out.println(s1);
		}
		
	}
}
/*
NEW
RUNNABLE
BLOCKED
WAITING
TIMED_WAITING
TERMINATED

A thread state. A thread can be in one of the following states:

    NEW
    A thread that has not yet started is in this state.
    RUNNABLE
    A thread executing in the Java virtual machine is in this state.
    BLOCKED
    A thread that is blocked waiting for a monitor lock is in this state.
    WAITING
    A thread that is waiting indefinitely for another thread to perform a 
    particular action is in this state.
    TIMED_WAITING
    A thread that is waiting for another thread to perform an action for up to a 
    specified waiting time is in this state.
    TERMINATED
    A thread that has exited is in this state.


*/