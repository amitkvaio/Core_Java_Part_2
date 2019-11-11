package com.lara6;

import java.util.Calendar;
import java.util.Date;

public class M
{
	public static void main(String[] args)
	{
		Calendar cal =Calendar.getInstance();
		cal.add(Calendar.MONTH, 2);
		
		Date d1 = cal.getTime();
		System.out.println(d1);
	}
}
/*
adding two month
*/