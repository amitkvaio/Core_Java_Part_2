package com.lara1;

public class K
{
	public static void main(String[] args)
	{
		System.out.println(1);
		try
		{
			Class.forName("");
		} 
		catch (ClassNotFoundException ex)
		{
			System.out.println(ex);
			// TODO: handle exception
		}
		System.out.println(2);
	}
}
