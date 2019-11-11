package com.lara2;

public class H
{
	public static void main(String[] args)
	{
		String s1="abc abc abc abc";
		//		   012345678901234
		int i = s1.lastIndexOf("abc");//12
		System.out.println(i);
		int j=s1.lastIndexOf("abc",5);//4
		System.out.println(j);
		int k = s1.lastIndexOf("abc",9);//8
		System.out.println(k);
	}
}
/*
lastIndexOf
public int lastIndexOf(String str,int fromIndex)
Returns the index within this string of the last occurrence of the specified substring, 
searching backward starting at the specified index. 
*/