package com.lara6;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Z1{
	public static void main(String[] args){
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 20);
		Date d0= cal.getTime();
		DateFormat df0=DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df0.format(d0));
		System.out.println("...........");
		
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println("..........");
		
		
		DateFormat df1 = DateFormat.getDateInstance();
		String s1 = df1.format(d1);
		System.out.println(s1);
		System.out.println("...........");
		
		Date d2 = null;
		
		try{
			d2=df1.parse(s1);
			System.out.println(d2);
		}catch (ParseException e){
			e.printStackTrace();
		}
	}
}
