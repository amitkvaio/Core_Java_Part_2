package com.lara6;

import java.util.Date;

public class F
{
	public static void main(String[] args)
	{
		Date d0 = new Date(0);
		System.out.println(d0);
		
		Date d1 = new Date(1000*60*60*24);
		System.out.println(d1);
		System.out.println(d1.getTime());
	}
}
