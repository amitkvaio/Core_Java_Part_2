package com.lara;

public class I
{
	public static void main(String[] args)
	{
		System.out.println(1);
		int x[] = new int[999999999];
		System.out.println(2);
	}
}

/*
abnormal condition as array is an object it requires several indices 
heap memory unable to handle array.
1
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at com.lara.I.main(I.java:8)

*/