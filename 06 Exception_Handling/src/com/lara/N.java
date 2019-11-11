package com.lara;

public class N
{
public static void main(String[] args)
{
	int i=10;//local to main we can use within the main method
	  try
	   {
	
		System.out.println("try i = " + i );
		
	   }
	  catch(ArithmeticException ex)
	    {
		
		System.out.println(i);
	    }
	System.out.println(i);
	
 }
}
