package com.lara6;

import java.text.DateFormat;
import java.util.Date;

public class T
{
	public static void main(String[] args)
	{
		Date d1 = new Date();
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String s1 = df.format(d1);
		System.out.println(s1);
	}
}
// Apr 14,2014