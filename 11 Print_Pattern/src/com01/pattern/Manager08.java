package com01.pattern;

public class Manager08
{
	public static void main(String[] args)
	{
		for (char ch = 'E'; ch >='A'; ch--)
		{
			for (char c = 'E'; c >='A'; c--)
			{
				System.out.print(ch+" ");
			}	
			System.out.println();
		}
		System.out.println("***THANK YOU!!***");
	}
}
/*

E E E E E 
D D D D D 
C C C C C 
B B B B B 
A A A A A

*/