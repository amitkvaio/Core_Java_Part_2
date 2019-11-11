package com.lara4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A
{
	public static void main(String[] args)
	{
		String s1 = "abcbc909c";
		//			 012345678
		
		String s2 = "c";
		
		Pattern p1 = Pattern.compile(s2);

		Matcher m1 = p1.matcher(s1);
		
		while(m1.find())
		{
			System.out.println(m1.start());
		}
	}
}
