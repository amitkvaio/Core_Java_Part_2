//61
package com.lara.pack01;

class A
{
	synchronized void test1()
	{
		for (int i = 0; i < 100; i++)
		{
			System.out.println("from test1:-" + i);
		}
		System.out.println(".........End of test1........");
		try
		{
			System.out.println("Sleeping state--Class lock is buzy now - will release shortly");
			Thread.sleep(10000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	synchronized void test2()
	{
		for (int i = 1000; i < 1200; i++)
		{
			System.out.println("form test2:-" + i);
		}
		System.out.println(".......End of test2.....");
	}
}

class B extends Thread
{
	A a1;

	B(A a1) {
		this.a1 = a1;
	}

	@Override
	public void run()
	{
		a1.test1();

	}
}

class C extends Thread
{
	A a1;

	C(A a1) {
		this.a1 = a1;
	}

	@Override
	public void run()
	{
		a1.test2();
	}
}

public class Manager1
{
	public static void main(String[] args)
	{
		A a1 = new A();
		B b1 = new B(a1);
		C c1 = new C(a1);

		b1.start();
		c1.start();
	}
}

/*
Synchronized :-
Synchronized modifier is the modifier applicable for methods but not for classes and variables.
If a method or a block declared as synchronized then at a time only one 
	Thread is allowed to operate on the given object.
The main advantage of synchronized modifier is we can resolve data inconsistency problems.
But the main disadvantage of synchronized modifier is it increases the waiting 
	time of the Thread and effects performance of the system .Hence if there is no 
	specific requirement it is never recommended to use.
The main purpose of this modifier is to reduce the data inconsistency problems.

output will be sequential
 */