package com.lara1;

public class Z
{
	public static void main(String[] args)
	{
		String s1="abcxyz";
			//	   012345	
		System.out.println(s1.charAt(0));//a
		char c1=s1.charAt(3);//x
		System.out.println(c1);//x
		//System.out.println(s1.charAt(20));//StringIndexOutOfBoundsException:
		System.out.println("done");
	}
}
