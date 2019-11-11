package com.lara3;

public class B
{
	public static void main(String[] args)
	{
		String s1 = "java";
		String s2 = "ja";
		String s3 = "va";
		String  s4 = s2+s3;
		//here s2 and s3 are reference variable so string object is creating in the non constant pool
		
		System.out.println(s1==s4);//F
		System.out.println(s1.equals(s4));//T
		
		System.out.println(s1.hashCode());
		System.out.println(s4.hashCode());
		
	}
}
