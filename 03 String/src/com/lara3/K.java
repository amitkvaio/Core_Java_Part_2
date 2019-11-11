package com.lara3;

public class K
{
	public static void main(String[] args)
	{
		StringBuffer sf =  new  StringBuffer();
		sf.append("abcdefghi");
				// 012345678
		System.out.println(sf);
		sf.delete(2,6);
		System.out.println(sf);
				   
	}
}
