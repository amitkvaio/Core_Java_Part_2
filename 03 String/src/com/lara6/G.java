package com.lara6;

import java.util.Date;

public class G
{
	public static void main(String[] args)
	{
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.getTime());
		
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
	}
}
