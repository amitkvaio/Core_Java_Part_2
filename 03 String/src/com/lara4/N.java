package com.lara4;

public class N
{
	public static void main(String[] args)
	{
		E.find("a1b2c3d45e89&97%26", "[1-9]");
		System.out.println("............");
		E.find("a1b2c3d45e89&97%26","\\d");
	}
}
