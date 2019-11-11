package com.lara2;

public class F
{
	public static void main(String[] args)
	{
		String s1= "abababab";
		//			01234567
		int i = s1.indexOf('b');//1
		int j  =s1.indexOf('a',3);//4
		int k = s1.lastIndexOf('b');//7
		int m= s1.lastIndexOf('a');//6
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
			
		
	}
}
