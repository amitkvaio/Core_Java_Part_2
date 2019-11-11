package com.lara3;

public class M
{
	public static void main(String[] args)
	{
		StringBuffer sf = new StringBuffer();
		sf.append("hellojava");
		//		   012345657
		sf.deleteCharAt(6);//delete the 6th index character.
		System.out.println(sf);
		
		sf.trimToSize();
		
		System.out.println(sf);
	}
}
