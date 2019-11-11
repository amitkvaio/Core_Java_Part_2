package com.lara1;

public class L
{
	public static void main(String[] args)
	{
		String s1 = "abc";
		System.out.println(s1+10);//abc10
		System.out.println(10+s1);//10abc
		System.out.println(10+20+s1);//10+20=30abc
		System.out.println(s1+10+20);//abc+10=abc10="abc10"="abc10"+20=abc1020
		System.out.println(s1.length());//3
	}
}
