package com.lara.app1;

class E implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 500; i++)
		{
			System.out.println(i);
		}
	}

}

public class Manager10
{

	public static void main(String[] args)
	{
		E e1 = new E();
		Thread t1 = new Thread(e1);
		t1.start();
		System.out.println("****************");
		Thread t2 = new Thread(e1);
		t2.start();
		System.out.println("done");
	}

}
