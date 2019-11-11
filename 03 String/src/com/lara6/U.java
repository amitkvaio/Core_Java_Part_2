package com.lara6;

import java.text.DateFormat;
import java.util.Date;

public class U
{
	public static void main(String[] args)
	{
		Date d1 = new Date();
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL);

		System.out.println(df1.format(d1));
		System.out.println(df2.format(d1));
	}
}

/*

April 14, 2014
Monday, April 14, 2014

*/