package com.lara1;

public class I
{
	public static void main(String[] args)
	{
		String s1 = null;
		s1=s1+null+s1;
		System.out.println(s1);
		System.out.println(s1.length());
	}
}
//here + operator is creating physical string object that object is assign in the 
//s1 ,s1+null+s1 represent the 12 character 
//s1 is reinitialized