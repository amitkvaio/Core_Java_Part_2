package com.lara.app2;

class J implements Runnable
{
	@Override
	public void run()
	{
		// TODO Auto-generated method stub

	}
}

public class Manager8
{
	public static void main(String[] args)
	{
		J j1 = new J();
		Thread t1 = new Thread(j1);
		Thread t2 = new Thread(j1, "lara");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println("..............");
		t1.setName("thread1");
		t2.setName("thread2");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println("..........");

	}

}
