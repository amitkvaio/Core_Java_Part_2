package com.lara6;

import java.util.Calendar;
import java.util.Date;

public class O
{
	public static void main(String[] args)
	{
		Calendar cal =Calendar.getInstance();
		Date d1 = cal.getTime();
		System.out.println(d1);
		
		cal.add(Calendar.DATE, 3);
		//adding 3 days to the system date
		Date d2 = cal.getTime();
		System.out.println(d2);
	}
}
