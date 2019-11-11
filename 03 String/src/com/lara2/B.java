package com.lara2;

public class B
{
	public static void main(String[] args)
	{
		String s1 = "hello 123 xyz";
				//	 0123456789012
		int i=s1.indexOf("123");//6
		System.out.println(i);
		int j = s1.indexOf("xy");//10
		System.out.println(j);
		int k = s1.indexOf("bc");//-1
		System.out.println(k); 
		int l = s1.indexOf("yza");//-1
		System.out.println(l);
		
	}
}
