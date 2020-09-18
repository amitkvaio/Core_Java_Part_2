package com.lara6;
import java.util.Calendar;
import java.util.Date;

public class K {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 3);
		Date d1 = cal.getTime();
		System.out.println(d1);
	}
}
/*
after adding the 3 day to the calendar 
*/