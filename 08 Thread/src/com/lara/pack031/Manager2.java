package com.lara.pack031;

public class Manager2
{
	public static void main(String[] args)
	{
		System.out.println("main method start*******");
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		A a1 = new A(s1);
		B b1 = new B(s2);
		a1.start();
		b1.start();
		System.out.println("main method end*********");
	}

}

//output will be simultaneous
