package com.lara6;

import java.util.Date;

public class E1
{
	
	public static void main(String[] args)
	{
		Date d1 = new  Date();
		
		System.out.println("GETDATE="+d1.getDate());
		System.out.println("GETDAY="+d1.getDay());
		System.out.println("GETHOURS="+d1.getHours());
		System.out.println("GETMINUTE="+d1.getMinutes());
		System.out.println("GETMONTH="+d1.getMonth());
		System.out.println("GETSECONDS="+d1.getSeconds());
		System.out.println("GETTIME="+d1.getTime());
		System.out.println("GETTIMEZONEOFSET="+d1.getTimezoneOffset());
		System.out.println("GETYEAR="+d1.getYear());
		System.out.println("GETCLASS="+d1.getClass());
		System.out.println(d1.after(d1));
	}
}
