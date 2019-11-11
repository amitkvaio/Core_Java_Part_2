package com.lara6;

import java.util.Date;

public class C
{
	public static void main(String[] args)
	{
		Date d1 = new Date();
		
		Date d2 = new Date(0);
		
		Date d3 = new Date(1000);
		System.out.println(d1);
		System.out.println(d2);//base date
		System.out.println(d3);//adding 1 second to the base date
	}
}
