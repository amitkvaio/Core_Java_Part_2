package com.lara1;

public class R
{
	R() throws ClassNotFoundException {

	}

	public static void main(String[] args)
	{
		try
		{
			R r1 = new R();
			test();
		} catch (ClassNotFoundException ex)
		{

		}
	}

	static void test() throws ClassNotFoundException
	{
		R r1 = new R();
	}
}
