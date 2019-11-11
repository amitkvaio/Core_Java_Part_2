package com.lara4;

import java.util.StringTokenizer;

public class Y
{
	public static void main(String[] args)
	{
		String s1 = "hello1abc2java3xyz";
		String s2 ="[0-9]";
		StringTokenizer st = new StringTokenizer(s1,s2);
		while(st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}
	}
}
