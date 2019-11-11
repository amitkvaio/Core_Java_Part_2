package com.lara.app2;

class A extends Thread
{
	@Override
	public void run()
	{
		System.out.println("DONE");
	}
}

public class Manager1
{
	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println("default properties");
		long id = a1.getId();
		String name = a1.getName();
		int priority = a1.getPriority();
		boolean daemonstatus = a1.isDaemon();
		System.out.println(id);
		System.out.println(name);
		System.out.println(priority);
		System.out.println(daemonstatus);
		a1.start();

	}
}

/*

Getting and setting names of Thread:-
1) Every Thread in java having name
a. default name of the main thread is main
b. default name of user created threads starts from Thread-0.
t1 --Thread-0
t2 --Thread-1
t3 --Thread-2
2) To set the name use setName() & to get the name use getName(),
Public final String getName()
Public final void setName(String name)

*/