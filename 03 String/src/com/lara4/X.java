package com.lara4;

import java.util.StringTokenizer;

public class X
{
	public static void main(String[] args)
	{
		String s1 = "abc;xyz;hello;done";
		
		String s2 = ";";
		StringTokenizer st = new StringTokenizer(s1,s2);
		
		while(st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}
		
		
	}
}
