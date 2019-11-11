package com.lara3;

public class H
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("abc");
		sb.append("abc");
		
		System.out.println(sb.capacity());
		sb.trimToSize();//remove the unaccupied space from the buffer
		
		System.out.println("After removing unaccupied space="+sb.capacity());
		System.out.println(sb.length());
	}
}
