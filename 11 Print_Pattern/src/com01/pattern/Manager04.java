package com01.pattern;

public class Manager04
{
	public static void main(String[] args)
	{
		for (char ch = 'A'; ch <='Z'; ch++)
		{
			for (char c = 'A'; c <='Z'; c++)
			{
				System.out.print(ch+" ");
			}	
			System.out.println();
		}
		System.out.println("***THANK YOU!!***");
	}
}

/*

A A A A A 
B B B B B 
C C C C C 
D D D D D 
E E E E E

*/